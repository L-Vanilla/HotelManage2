package com.neuedu.service;

import com.neuedu.pojo.GoodsType;

import java.util.List;
/*商品类型管理
 * 6-14Vanilla
 * */
public interface GoodsTypeService {
    List<GoodsType> getGoodsTypes(GoodsType goodsType);
    List<GoodsType> getAll(GoodsType goodsType);
    GoodsType getgoodsTypeById(int id);
    int add(GoodsType goodsType);
    int del(GoodsType goodsType);
    //    int del(Integer id);
    int update(GoodsType goodsType);
}
