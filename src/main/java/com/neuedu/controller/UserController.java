package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.User;
import com.neuedu.service.UserService;

import com.neuedu.utils.MyLog;
import org.apache.ibatis.annotations.Param;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @GetMapping("/list")
    public PageInfo<User> getFloor(User user) {
        List<User> users = userService.getUsers(user);
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }

    @GetMapping("/getAll")
    public List<User> getAll(User user) {
        return userService.getAll(user);
    }

    @PostMapping("/add")
    public int add(User user) {
        return userService.add(user);
    }

    @GetMapping("/del")
    public int del(User user) {
        return userService.update(user);
    }

    @PostMapping("/update")
    public int update(User user) {
        return userService.update(user);
    }

//    @MyLog(value = "登录")  //这里添加了AOP的自定义注解
    @CrossOrigin(allowCredentials = "true")
    @PostMapping("/login")
    public User login(@Param("userName") String userName, @Param("userPwd") String userPwd, HttpServletResponse response) {
        User user = userService.getUserByNameAndUserPwd(userName, userPwd);
//        session.setAttribute("user",user);
//        System.out.println("session"+user.getUserName());
//        UsernamePasswordToken token = new UsernamePasswordToken(userName, userPwd);
        Cookie cookie = new Cookie("userName", user.getUserName());
        cookie.setMaxAge(24 * 60 * 60); //存活期为1天
        cookie.setPath("/");
        response.addCookie(cookie);
        System.out.println("cookie" + cookie.getValue());
        return user;
    }
//    @MyLog(value = "退出")  //这里添加了AOP的自定义注解
    @GetMapping("/logout")
    public Integer logout(HttpServletRequest request,
                          HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                cookie.setMaxAge(0);//销毁cookie
                response.addCookie(cookie);
            }
        }
        return 1;
    }

    @GetMapping("/getOne")
    public User getOne(Integer id){
        return userService.getuserById(id);
    }


}
