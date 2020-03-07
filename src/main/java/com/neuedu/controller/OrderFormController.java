package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.Leaguer;
import com.neuedu.pojo.OrderForm;
import com.neuedu.pojo.OrderManage;
import com.neuedu.pojo.Rooms;
import com.neuedu.service.LeaguerService;
import com.neuedu.service.OrderFormService;
import com.neuedu.service.OrderManageService;
import com.neuedu.service.RoomsService;
import com.neuedu.utils.MyLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/checkout")
public class OrderFormController {
    @Resource
    OrderFormService orderFormService;
    @Resource
    RoomsService roomsService;
    @Resource
    OrderManageService orderManageService;
    @Resource
    LeaguerService leaguerService;
    @GetMapping("/list")
    public PageInfo<OrderForm> getOrderForm(OrderForm orderForm){
        List<OrderForm> orderForms =orderFormService.getOrderForms(orderForm);
        PageInfo<OrderForm> pageInfo = new PageInfo<>(orderForms);
        return pageInfo;
    }

    @GetMapping("/getAll")
    public List<OrderForm> getAll(OrderForm orderForm){
        return orderFormService.getAll(orderForm);
    }
    @MyLog(value = "退房结账处理")  //这里添加了AOP的自定义注解
    @PostMapping("/add")
    public int add(OrderForm orderForm , OrderManage orderManage,Leaguer leaguer){
        System.out.println("房间号id"+orderManage.getCurrentRoomId());
        System.out.println("入住单号id"+orderManage.getId());
        System.out.println("会员编号"+orderManage.getMemberId());
        System.out.println("会员结账前积分"+leaguer.getLeaguerScore());
        int leaguerScore =leaguer.getLeaguerScore() + orderForm.getTotalBill().intValue();//将结账金额转换成int型
        System.out.println("结账后积分"+leaguerScore);
        /*将客房变为空房状态*/
        Rooms rooms = new Rooms();
        rooms.setId(orderManage.getCurrentRoomId());
        rooms.setStatus(0);
        roomsService.update(rooms);
        //将order_manage状态变为已退房
        OrderManage orderManage1 = new OrderManage();
        orderManage1.setId(orderManage.getId());
        orderManage1.setBookStatus(3);
        //更行预定订单的离店时间
        orderManage1.setLeaveTime(new Date());
        orderManageService.update(orderManage1);
        //将leaguer表会员积分进行更新
        Leaguer leaguer2 = new Leaguer();
        leaguer2.setId(orderManage.getMemberId());
        leaguer2.setLeaguerScore(leaguerScore);
        if (leaguerScore>5000){
            leaguer2.setLeaguerRank("VIP");
        }
        leaguerService.update(leaguer2);


        //进行结账处理
        return orderFormService.add(orderForm);
    }
    @GetMapping("/del")
    public int del(OrderForm orderForm){
        return orderFormService.update(orderForm);
    }

    @PostMapping("/update")
    public int update(OrderForm orderForm){
        return orderFormService.update(orderForm);
    }
    @GetMapping("/getOne")
    public OrderForm getOne(Integer id){
        return orderFormService.getorderFormById(id);
    }
}
