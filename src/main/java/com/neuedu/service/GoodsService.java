package com.neuedu.service;

import com.neuedu.pojo.Goods;

import java.util.List;
/*商品管理
 * 6-14Vanilla
 * */
public interface GoodsService {
    List<Goods> getGoodss(Goods goods);
    List<Goods> getAll(Goods goods);
    Goods getgoodsById(int id);
    int add(Goods goods);
    int del(Goods goods);
    //    int del(Integer id);
    int update(Goods goods);
}
