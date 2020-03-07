package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.OrderFormMapper;
import com.neuedu.pojo.OrderForm;
import com.neuedu.pojo.OrderFormExample;
import com.neuedu.service.OrderFormService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class OrderFormServiceImpl implements OrderFormService {
    @Resource
    OrderFormMapper orderFormMapper;
    @Override
    public List<OrderForm> getOrderForms(OrderForm orderForm) {
        PageHelper.startPage(orderForm.getPageNo(), orderForm.getPageSize());
        OrderFormExample orderFormExample = new OrderFormExample();
        OrderFormExample.Criteria criteria = orderFormExample.createCriteria();
        if(orderForm.getId()!=null) {
            criteria.andIdEqualTo(orderForm.getId()).andActiveEqualTo(1);
        }  /*根据现在房间号模糊查询*/
        if (StringUtils.isNotBlank(orderForm.getRoomId())){
            criteria.andRoomIdLike("%"+orderForm.getRoomId()+"%").andActiveEqualTo(1);
        }else {
            criteria.andActiveEqualTo(1);
        }
        orderFormExample.setOrderByClause("id desc");
        return orderFormMapper.selectByExample(orderFormExample);
    }
    @Override
    public List<OrderForm> getAll(OrderForm orderForm) {
        OrderFormExample orderFormExample = new OrderFormExample();
        return orderFormMapper.selectByExample(orderFormExample);
    }
    @Override
    public OrderForm getorderFormById(int id) {
        return orderFormMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(OrderForm orderForm) {
        orderForm.setCreateDate(new Date());
        return orderFormMapper.insertSelective(orderForm);
    }

    @Override
    public int del(OrderForm orderForm) {
        return orderFormMapper.updateByPrimaryKeySelective(orderForm);
    }

    @Override
    public int update(OrderForm orderForm) {
        return orderFormMapper.updateByPrimaryKeySelective(orderForm);
    }
}
