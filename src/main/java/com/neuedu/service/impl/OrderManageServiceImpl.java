package com.neuedu.service.impl;
import com.github.pagehelper.PageHelper;
import com.neuedu.dao.OrderManageMapper;
import com.neuedu.pojo.OrderManage;
import com.neuedu.pojo.OrderManageExample;
import com.neuedu.service.OrderManageService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*Vanilla
 * 预定信息管理
 * 6-17
 * */
@Service
public class OrderManageServiceImpl implements OrderManageService {
    @Resource
    OrderManageMapper orderManageMapper;
    @Override
    public List<OrderManage> getOrderManages(OrderManage orderManage) {

        PageHelper.startPage(orderManage.getPageNo(), orderManage.getPageSize());
        OrderManageExample orderManageExample = new OrderManageExample();
        OrderManageExample.Criteria criteria = orderManageExample.createCriteria();
        /*根据订单编号模糊查询*/
        if (orderManage.getId()!=null) {
            criteria.andIdEqualTo(orderManage.getId()).andActiveEqualTo(1);
        }
        /*根据现在房间编号查询*/
        if (orderManage.getCurrentRoomId()!=null) {
            criteria.andCurrentRoomIdEqualTo(orderManage.getCurrentRoomId()).andActiveEqualTo(1);
//            criteria.andIdEqualTo(orderManage.getCurrentRoomId()).andActiveEqualTo(1);
        }
        //根据房间号的模糊查询
        if(StringUtils.isNotBlank(orderManage.getCurrentRoomName())){
            criteria.andCurrentRoomNameLike("%"+orderManage.getCurrentRoomName()+"%");
        }
        if (StringUtils.isNotBlank(orderManage.getOriginalRoomName())){
            criteria.andOriginalRoomNameEqualTo(orderManage.getOriginalRoomName()).andActiveEqualTo(1);
        }
        /*根据预定状态查询信息*/
        if(orderManage.getBookStatus()!=null){
            //根据状态查询
            if(orderManage.getBookStatus()<5){
                criteria.andBookStatusEqualTo(orderManage.getBookStatus()).andActiveEqualTo(1);
            }
            //若是5只查预定和取消的
             else if(orderManage.getBookStatus()==5){
                criteria.andBookStatusBetween(0,1);
            }
            else{
                criteria.andBookStatusBetween(0,2);
            }
        }
        /*根据预定人姓名模糊查询*/
        if(StringUtils.isNotBlank(orderManage.getResidents())){
            criteria.andResidentsLike("%"+orderManage.getResidents()+"%").andActiveEqualTo(1);
        }
        /*根据房间类型名称进行模糊查询*/
        if(StringUtils.isNotBlank(orderManage.getRoomsTypeName())){
            criteria.andRoomsTypeNameLike("%"+orderManage.getRoomsTypeName()+"%").andActiveEqualTo(1);
        }
        /*根据入住人名称进行模糊查询 --zyp*/
        if(StringUtils.isNotBlank(orderManage.getResidents())){
            criteria.andResidentsLike("%"+orderManage.getResidents()+"%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        orderManageExample.setOrderByClause("id desc");
        return orderManageMapper.selectByExample(orderManageExample);
    }

    //ZYP 查询已入住2和已换房4状态的房间
    @Override
    public List<OrderManage> getLivedOrderManages(OrderManage orderManage) {

        PageHelper.startPage(orderManage.getPageNo(), orderManage.getPageSize());
        OrderManageExample orderManageExample = new OrderManageExample();
        OrderManageExample.Criteria criteria = orderManageExample.createCriteria();
        OrderManageExample.Criteria criteria2 = orderManageExample.createCriteria();
        /*根据订单编号模糊查询*/
        if (orderManage.getId()!=null) {
            criteria.andIdEqualTo(orderManage.getId()).andActiveEqualTo(1).andBookStatusEqualTo(2);
            criteria2.andIdEqualTo(orderManage.getId()).andActiveEqualTo(1).andBookStatusEqualTo(4);
            orderManageExample.or(criteria2);
        }
        /*根据现在房间编号查询*/
        if (orderManage.getCurrentRoomId()!=null) {
            criteria.andCurrentRoomIdEqualTo(orderManage.getCurrentRoomId()).andActiveEqualTo(1).andBookStatusEqualTo(2);
            criteria2.andCurrentRoomIdEqualTo(orderManage.getCurrentRoomId()).andActiveEqualTo(1).andBookStatusEqualTo(4);
            orderManageExample.or(criteria2);
        }
        /*根据现在房间号模糊查询*/
        if (StringUtils.isNotBlank(orderManage.getCurrentRoomName())){
            criteria.andCurrentRoomNameLike("%"+orderManage.getCurrentRoomName()+"%").andActiveEqualTo(1).andBookStatusEqualTo(2);
            criteria2.andCurrentRoomNameLike("%"+orderManage.getCurrentRoomName()+"%").andActiveEqualTo(1).andBookStatusEqualTo(4);
            orderManageExample.or(criteria2);
        }
        /*根据入住人名称进行模糊查询 --zyp*/
        if(StringUtils.isNotBlank(orderManage.getResidents())){
            criteria.andResidentsLike("%"+orderManage.getResidents()+"%").andActiveEqualTo(1).andBookStatusEqualTo(2);
            criteria2.andResidentsLike("%"+orderManage.getResidents()+"%").andActiveEqualTo(1).andBookStatusEqualTo(4);
            orderManageExample.or(criteria2);
        }
        else {
            criteria.andActiveEqualTo(1).andBookStatusEqualTo(2);
            criteria2.andActiveEqualTo(1).andBookStatusEqualTo(4);
            orderManageExample.or(criteria2);
        }
        orderManageExample.setOrderByClause("id desc");
        return orderManageMapper.selectByExample(orderManageExample);
    }

    //ZYP 查询已预订0、已入住2和已换房4、已退房3状态的房间 财务进账报表
    @Override
    public List<OrderManage> getOrderManages3(OrderManage orderManage) {

        PageHelper.startPage(orderManage.getPageNo(), orderManage.getPageSize());
        OrderManageExample orderManageExample = new OrderManageExample();
        OrderManageExample.Criteria criteria = orderManageExample.createCriteria();

        //根据时间范围查询
        Date predate;
        Date latedate;
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"));    //获取东八区时间

        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String curDate = s.format(c.getTime());

        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd 23:59:59");
        String curDate2 = s2.format(c.getTime());//当前日期

        //没有时间的时候默认是今天的查询：

        /*根据现在房间号模糊查询*/
        if (StringUtils.isNotBlank(orderManage.getCurrentRoomName())){
            criteria.andCurrentRoomNameLike("%"+orderManage.getCurrentRoomName()+"%").andActiveEqualTo(1).andBookStatusNotEqualTo(1);
        }
        if(orderManage.getArrivalTime()==null&&orderManage.getLeaveTime()==null) {
            predate = StringToDate(curDate);
            latedate = StringToDate(curDate2);
            criteria.andLeaveTimeBetween(predate, latedate);
            criteria.andActiveEqualTo(1).andBookStatusNotEqualTo(1);
        } else if (orderManage.getArrivalTime()!=null&&orderManage.getLeaveTime()==null) {
            predate = orderManage.getArrivalTime();
            latedate = StringToDate(curDate2);
            criteria.andLeaveTimeBetween(predate, latedate);
            criteria.andActiveEqualTo(1).andBookStatusNotEqualTo(1);
        }else if(orderManage.getArrivalTime()==null&&orderManage.getLeaveTime()!=null){
            predate = StringToDate(curDate);
            latedate = orderManage.getLeaveTime();
            criteria.andLeaveTimeBetween(predate, latedate);
            criteria.andActiveEqualTo(1).andBookStatusNotEqualTo(1);
        }
        else {
            predate = orderManage.getArrivalTime();
            latedate = orderManage.getLeaveTime();
            criteria.andLeaveTimeBetween(predate, latedate);
            criteria.andActiveEqualTo(1).andBookStatusNotEqualTo(1);
        }
        orderManageExample.setOrderByClause("id desc");
        return orderManageMapper.selectByExample(orderManageExample);
    }
    //ZYP 查询已预订、已取消状态的房间
    @Override
    public List<OrderManage> getOrderManages4(OrderManage orderManage) {

        PageHelper.startPage(orderManage.getPageNo(), orderManage.getPageSize());
        OrderManageExample orderManageExample = new OrderManageExample();
        OrderManageExample.Criteria criteria = orderManageExample.createCriteria();
        OrderManageExample.Criteria criteria2 = orderManageExample.createCriteria();

        /*根据现在房间号模糊查询*/
        if (StringUtils.isNotBlank(orderManage.getCurrentRoomName())){
            criteria.andCurrentRoomNameLike("%"+orderManage.getCurrentRoomName()+"%").andActiveEqualTo(1).andBookStatusEqualTo(0);
            criteria2.andCurrentRoomNameLike("%"+orderManage.getCurrentRoomName()+"%").andActiveEqualTo(1).andBookStatusEqualTo(1);
            orderManageExample.or(criteria2);
        } else{
            criteria.andActiveEqualTo(1).andBookStatusEqualTo(0);
            criteria2.andActiveEqualTo(1).andBookStatusEqualTo(1);
            orderManageExample.or(criteria2);
        }
        if(orderManage.getBookStatus()!=null){

        }

        return orderManageMapper.selectByExample(orderManageExample);
    }

    //ldf 离店报表
    @Override
    public List<OrderManage> getLeavingGuestTodayAll(OrderManage orderManage) {
        PageHelper.startPage(orderManage.getPageNo(), orderManage.getPageSize());
        OrderManageExample orderManageExample = new OrderManageExample();
        OrderManageExample.Criteria criteria = orderManageExample.createCriteria();

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
//            System.out.println("当前二次时间：" + year + "-" + month + "-" + day + " " + time + ":" + min + ":" + sec);
//            System.out.println(curDate2);

        //没有时间的时候默认是今天的查询：
        if(orderManage.getArrivalTime()==null&&orderManage.getLeaveTime()==null) {
            predate = StringToDate(curDate);
            latedate = StringToDate(curDate2);
        } else if (orderManage.getArrivalTime()!=null&&orderManage.getLeaveTime()==null) {
            predate = orderManage.getArrivalTime();
            latedate = StringToDate(curDate2);
        }else if(orderManage.getArrivalTime()==null&&orderManage.getLeaveTime()!=null){
            predate = StringToDate(curDate);
            latedate = orderManage.getLeaveTime();
        }else{
            predate = orderManage.getArrivalTime();
            latedate = orderManage.getLeaveTime();
        }

        criteria.andLeaveTimeBetween(predate, latedate);
//            System.out.println("结束了");
        if (StringUtils.isNotBlank(orderManage.getCurrentRoomName())) {
            criteria.andCurrentRoomNameEqualTo(orderManage.getCurrentRoomName());
        }

        //查询active为1且已经结账的订单
        criteria.andActiveEqualTo(1).andBookStatusEqualTo(3);

        return orderManageMapper.selectByExample(orderManageExample);
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


    @Override
    public List<OrderManage> getAll(OrderManage orderManage) {
        OrderManageExample orderManageExample = new OrderManageExample();
        orderManageExample.createCriteria().andActiveEqualTo(1);//只查状态为1的
        return orderManageMapper.selectByExample(orderManageExample);
    }

    @Override
    public OrderManage getorderManageById(int id) {
        return orderManageMapper.selectByPrimaryKey(id);
    }
    @Override
    public int add(OrderManage orderManage) {
        orderManage.setCreateDate(new Date());
        return orderManageMapper.insertSelective(orderManage);
    }

    @Override
    public int del(OrderManage orderManage) {
        return orderManageMapper.updateByPrimaryKeySelective(orderManage);
    }

    @Override
    public int update(OrderManage orderManage) {
        return orderManageMapper.updateByPrimaryKeySelective(orderManage);
    }

    //LDF-统计查询
    @Override
    public List<Map<String,String>> findGroupByRTN() {
        return orderManageMapper.findGroupByRTN();
    }
    @Override
    public List<Map<String,String>> findWeekBynNum() {
        return orderManageMapper.findWeekBynNum();
    }
    @Override
    public List<Map<String,String>> findTypeNumNull() {
        return orderManageMapper.findTypeNumNull();
    }
    @Override
    public List<Map<String,String>> findTypeNumTrue() {
        return orderManageMapper.findTypeNumTrue();
    }
    @Override
    public List<Map<String, String>> findTypeNumAll() { return orderManageMapper.findTypeNumAll(); }
    @Override
    public List<Map<String,String>> findGuestBill() {
        return orderManageMapper.findGuestBill();
    }
    @Override
    public List<Map<String,String>> findRoomType() {
        return orderManageMapper.findRoomType();
    }

    //ymq 预定报表
    @Override
    public List<OrderManage> ReservationAndCanacel(OrderManage orderManage) {
        PageHelper.startPage(orderManage.getPageNo(), orderManage.getPageSize());
        OrderManageExample orderManageExample = new OrderManageExample();
        OrderManageExample.Criteria criteria = orderManageExample.createCriteria();
        OrderManageExample.Criteria criteria2 = orderManageExample.createCriteria();
        Date predate;
        Date latedate;
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"));    //获取东八区时间
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String curDate = s.format(c.getTime());                                      //当前日期
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd 23:59:59");
        String curDate2 = s2.format(c.getTime());//当前日期
        //没有时间的时候默认是今天的查询：
        if(orderManage.getArrivalTime()==null&&orderManage.getLeaveTime()==null) {
            predate = StringToDate(curDate);
            latedate = StringToDate(curDate2);
            criteria.andCreateDateBetween(predate, latedate);
            criteria2.andCreateDateBetween(predate, latedate);
            criteria.andActiveEqualTo(1).andBookStatusEqualTo(0);
            criteria2.andActiveEqualTo(1).andBookStatusEqualTo(1);
            orderManageExample.or(criteria2);
        } else if (orderManage.getArrivalTime()!=null&&orderManage.getLeaveTime()==null) {
            predate = orderManage.getArrivalTime();
            latedate = StringToDate(curDate2);
            criteria.andCreateDateBetween(predate, latedate);
            criteria2.andCreateDateBetween(predate, latedate);
            criteria.andActiveEqualTo(1).andBookStatusEqualTo(0);
            criteria2.andActiveEqualTo(1).andBookStatusEqualTo(1);
            orderManageExample.or(criteria2);

        }else if(orderManage.getArrivalTime()==null&&orderManage.getLeaveTime()!=null){
            predate = StringToDate(curDate);
            latedate = orderManage.getLeaveTime();
            criteria.andCreateDateBetween(predate, latedate);
            criteria2.andCreateDateBetween(predate, latedate);
            criteria.andActiveEqualTo(1).andBookStatusEqualTo(0);
            criteria2.andActiveEqualTo(1).andBookStatusEqualTo(1);
            orderManageExample.or(criteria2);

        } else{
            predate = orderManage.getArrivalTime();
            latedate = orderManage.getLeaveTime();
            criteria.andCreateDateBetween(predate, latedate);
            criteria2.andCreateDateBetween(predate, latedate);
            criteria.andActiveEqualTo(1).andBookStatusEqualTo(0);
            criteria2.andActiveEqualTo(1).andBookStatusEqualTo(1);
            orderManageExample.or(criteria2);

        }
        if (StringUtils.isNotBlank(orderManage.getCurrentRoomName())) {
            criteria.andCurrentRoomNameEqualTo(orderManage.getCurrentRoomName());
        }
        return orderManageMapper.selectByExample(orderManageExample);
    }

    //ymq 在住报表
    @Override
    public List<OrderManage> getlistLived(OrderManage orderManage) {
        PageHelper.startPage(orderManage.getPageNo(), orderManage.getPageSize());
        OrderManageExample orderManageExample = new OrderManageExample();
        OrderManageExample.Criteria criteria = orderManageExample.createCriteria();
        OrderManageExample.Criteria criteria2 = orderManageExample.createCriteria();
        Date predate;
        Date latedate;
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"));    //获取东八区时间
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String curDate = s.format(c.getTime());                                      //当前日期
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd 23:59:59");
        String curDate2 = s2.format(c.getTime());//当前日期
        //没有时间的时候默认是今天的查询：
        if(orderManage.getArrivalTime()==null&&orderManage.getLeaveTime()==null) {
            predate = StringToDate(curDate);
            latedate = StringToDate(curDate2);
            criteria.andArrivalTimeBetween(predate, latedate);
            criteria2.andArrivalTimeBetween(predate, latedate);
            criteria.andActiveEqualTo(1).andBookStatusEqualTo(2);
            criteria2.andActiveEqualTo(1).andBookStatusEqualTo(4);
            orderManageExample.or(criteria2);
        } else if (orderManage.getArrivalTime()!=null&&orderManage.getLeaveTime()==null) {
            predate = orderManage.getArrivalTime();
            latedate = StringToDate(curDate2);
            criteria.andArrivalTimeBetween(predate, latedate);
            criteria2.andArrivalTimeBetween(predate, latedate);
            criteria.andActiveEqualTo(1).andBookStatusEqualTo(2);
            criteria2.andActiveEqualTo(1).andBookStatusEqualTo(4);
            orderManageExample.or(criteria2);
        }else if(orderManage.getArrivalTime()==null&&orderManage.getLeaveTime()!=null){
            predate = StringToDate(curDate);
            latedate = orderManage.getLeaveTime();
            criteria.andArrivalTimeBetween(predate, latedate);
            criteria2.andArrivalTimeBetween(predate, latedate);
            criteria.andActiveEqualTo(1).andBookStatusEqualTo(2);
            criteria2.andActiveEqualTo(1).andBookStatusEqualTo(4);
            orderManageExample.or(criteria2);
        } else{
            predate = orderManage.getArrivalTime();
            latedate = orderManage.getLeaveTime();
            criteria.andArrivalTimeBetween(predate, latedate);
            criteria2.andArrivalTimeBetween(predate, latedate);
            criteria.andActiveEqualTo(1).andBookStatusEqualTo(2);
            criteria2.andActiveEqualTo(1).andBookStatusEqualTo(4);
            orderManageExample.or(criteria2);

        }
        if (StringUtils.isNotBlank(orderManage.getCurrentRoomName())) {
            criteria.andCurrentRoomNameEqualTo(orderManage.getCurrentRoomName());
        }
        return orderManageMapper.selectByExample(orderManageExample);
    }



}
