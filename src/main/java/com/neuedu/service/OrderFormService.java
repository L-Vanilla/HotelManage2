package com.neuedu.service;//package com.neuedu.service;

import com.neuedu.pojo.OrderForm;

import java.util.List;

public interface OrderFormService {
    List<OrderForm> getOrderForms(OrderForm orderForm);
    List<OrderForm> getAll(OrderForm orderForm);
    OrderForm getorderFormById(int id);
    int add(OrderForm orderForm);
    int del(OrderForm orderForm);
    int update(OrderForm orderForm);
}
