package com.neuedu.utils;

import com.alibaba.fastjson.JSON;
import com.neuedu.pojo.LogManagement;
import com.neuedu.service.LogManagementService;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import java.lang.reflect.Method;
import java.util.Date;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


/**
 * 系统日志：切面处理类
 */
@Aspect
@Component
public class LogManagementAspect {
    @Autowired
    private LogManagementService logManagementService;

    //定义切点 @Pointcut
    //在注解的位置切入代码
    @Pointcut("@annotation( com.neuedu.utils.MyLog)")
    public void logPoinCut() {
    }

    //切面 配置通知
    @AfterReturning("logPoinCut()")
    public void saveLogManagement(JoinPoint joinPoint) {
        System.out.println("切面。。。。。");
        //保存日志
        LogManagement logManagement = new LogManagement();

        //从切面织入点处通过反射机制获取织入点处的方法
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        //获取切入点所在的方法
        Method method;
        method = signature.getMethod();

        //获取操作
        MyLog myLog = method.getAnnotation(MyLog.class);
        if (myLog != null) {
            String value = myLog.value();
            logManagement.setOperation(value);//保存获取的操作
        }

        //获取请求的类名
        String className = joinPoint.getTarget().getClass().getName();
        //获取请求的方法名
        String methodName = method.getName();
        logManagement.setMethod(className + "." + methodName);

        //请求的参数
//        Object[] args = joinPoint.getArgs();
//        //将参数所在的数组转换成json
//        String params = null;
//        try {
//            params = JacksonUtils.obj2json(args);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        logManagement.setParams(params);
        logManagement.setCreateDate(new Date());
        //获取用户名
        //此例子用到了ShiroUtils框架来实现获取用户名，此处还可以用session来获取登录操作名
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//        HttpSession session = request.getSession();
//        User user= (User) session.getAttribute("user");
        Cookie[] cookies=request.getCookies();
        System.out.println("cookie长度"+cookies.length);
        if(cookies!=null&&cookies.length>0){
            //遍历Cookie
            for(int i=0;i<cookies.length;i++){
                Cookie cookie=cookies[i];
                //此处类似与Map有name和value两个字段,name相等才赋值,并处理编码问题
                if("userName".equals(cookie.getName())){
                    System.out.println("cookie的值"+cookie.getValue());
                    logManagement.setUserName(cookie.getValue());
                }
            }
        }

//        System.out.println("POA用户名"+user.getUsername());
//       logManagement.setUsername(ShiroUtils.getUserEntity().getUsername());
//        //获取用户ip地址
//        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
        logManagement.setIp(IpAddressUtil.getIpAdrress(request));

        //调用service保存LogManagement实体类到数据库
        logManagementService.add(logManagement);
    }

}
