package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.LogManagementMapper;
import com.neuedu.pojo.LogManagement;
import com.neuedu.pojo.LogManagementExample;
import com.neuedu.service.LogManagementService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Service
public class LogManagementServiceImpl implements LogManagementService {
    @Resource
    LogManagementMapper logManagementMapper;
    @Override
    public List<LogManagement> getLogManagements(LogManagement logManagement) {

        PageHelper.startPage(logManagement.getPageNo(), logManagement.getPageSize());
        LogManagementExample logManagementExample = new LogManagementExample();
        LogManagementExample.Criteria criteria = logManagementExample.createCriteria();
        if (StringUtils.isNotBlank(logManagement.getUserName())) {
            criteria.andUserNameLike("%" + logManagement.getUserName() + "%").andActiveEqualTo(1);
        } else{
            criteria.andActiveEqualTo(1);
        }
        Date predate;
        Date latedate;
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"));    //获取东八区时间
//            //获取年
//            int year = c.get(Calendar.YEAR);
//            //获取月份，0表示1月份
//            int month = c.get(Calendar.MONTH) + 1;
//            //获取当前天数
//            int day = c.get(Calendar.DAY_OF_MONTH);
//            //获取本月最小天数
//            int first = c.getActualMinimum(Calendar.DAY_OF_MONTH);
//            //获取本月最大天数
//            int last = c.getActualMaximum(Calendar.DAY_OF_MONTH);
//            //获取当前小时
//            int time = c.get(Calendar.HOUR_OF_DAY);
//            //获取当前分钟
//            int min = c.get(Calendar.MINUTE);
//            //获取当前秒
//            int sec = c.get(Calendar.SECOND);
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String curDate = s.format(c.getTime());                                      //当前日期
//            System.out.println("当前时间：" + year + "-" + month + "-" + day + " " + time + ":" + min + ":" + sec);
//            System.out.println("第一天和最后天：" + first + "," + last);
//            System.out.println(curDate);

        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd 23:59:59");

        String curDate2 = s2.format(c.getTime());//当前日期
        //默认起始日期
        SimpleDateFormat s3 = new SimpleDateFormat("2019-06-01 00:00:00");
        String curDate3 =s3.format(c.getTime());
//            System.out.println("当前二次时间：" + year + "-" + month + "-" + day + " " + time + ":" + min + ":" + sec);
//            System.out.println(curDate2);

        //没有时间的时候默认是查询所有：
        if(logManagement.getTime1()==null&&logManagement.getTime2()==null) {
            predate = StringToDate(curDate3);
            latedate = StringToDate(curDate2);
        } else if (logManagement.getTime1()!=null&&logManagement.getTime2()==null) {
            predate = logManagement.getTime1();
            latedate = StringToDate(curDate2);
        }else if(logManagement.getTime1()==null&&logManagement.getTime2()!=null){
            predate = StringToDate(curDate3);
            latedate = logManagement.getTime2();
        }else{
            predate = logManagement.getTime1();
            latedate = logManagement.getTime2();
        }

        criteria.andCreateDateBetween(predate, latedate);
        logManagementExample.setOrderByClause("id desc");
//        LogManagementTypeExample logManagementTypeExample=new LogManagementTypeExample();
//        LogManagementTypeExample.Criteria criteria_type= logManagementTypeExample.createCriteria();

//        if(logManagement.getActive()!=null)
//            criteria.andActiveEqualTo(logManagement.getActive());
        return logManagementMapper.selectByExample(logManagementExample);
    }

    @Override
    public List<LogManagement> getAll(LogManagement logManagement) {
        LogManagementExample logManagementExample = new LogManagementExample();
//        logManagementExample.createCriteria().andActiveEqualTo(1);//只查状态为1的
        return logManagementMapper.selectByExample(logManagementExample);
    }

    @Override
    public LogManagement getlogManagementById(int id) {
        return logManagementMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(LogManagement logManagement) {
        return logManagementMapper.insertSelective(logManagement);
    }

    @Override
    public int del(LogManagement logManagement) {
        return logManagementMapper.updateByPrimaryKeySelective(logManagement);
    }

    @Override
    public int update(LogManagement logManagement) {
        return logManagementMapper.updateByPrimaryKeySelective(logManagement);
    }
    //String转Date
    public Date StringToDate(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m:s");
        Date date = null;
        try {
            date = sdf.parse(dateString);
        } catch (ParseException e) {
            //sdf的格式要与dateString的格式相同，否者会报错
            e.printStackTrace();
        }
        return date;
    }
}
