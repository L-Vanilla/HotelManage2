package com.neuedu.dao;

import com.neuedu.pojo.OrderManage;
import com.neuedu.pojo.OrderManageExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface OrderManageMapper {
    //LDF-查找不同类型房间的订单数量
    @Select("SELECT rooms_type_name,count(*) as count FROM order_manage group by rooms_type_name")
    List<Map<String,String>> findGroupByRTN();
    //LDF-查找最近一周的订单数量
    @Select("select count(*) as count,date(create_date) as date from order_manage where datediff(now(),create_date)<=7  group by day(create_date)")
    List<Map<String,String>> findWeekBynNum();

    //LDF-查询每种类型的房间数量：空房和有房
    @Select("select room_typeid,count(*) as count from rooms where status=0 group by room_typeid")
    List<Map<String,String>> findTypeNumNull();
    @Select("select room_typeid,count(*) as count from rooms where status!=0 group by room_typeid")
    List<Map<String,String>> findTypeNumTrue();
    @Select("select room_typeid,count(*) as count from rooms  group by room_typeid")
    List<Map<String,String>> findTypeNumAll();

    //客人的消费离散点
    @Select("select total_bill,create_date from order_form order by create_date desc limit 100")
    List<Map<String,String>> findGuestBill();

    @Select("select id,type_name from guest_type;")
    List<Map<String,String>> findRoomType();

    long countByExample(OrderManageExample example);

    int deleteByExample(OrderManageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderManage record);

    int insertSelective(OrderManage record);

    List<OrderManage> selectByExample(OrderManageExample example);

    OrderManage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderManage record, @Param("example") OrderManageExample example);

    int updateByExample(@Param("record") OrderManage record, @Param("example") OrderManageExample example);

    int updateByPrimaryKeySelective(OrderManage record);

    int updateByPrimaryKey(OrderManage record);
}