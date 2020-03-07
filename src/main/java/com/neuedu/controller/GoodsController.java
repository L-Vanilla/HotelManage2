package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.Goods;
import com.neuedu.pojo.GoodsType;
import com.neuedu.service.GoodsService;
import com.neuedu.service.GoodsTypeService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;
/*商品管理
* 6-15Vanilla
* */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    GoodsService goodsService;
    @Resource
    GoodsTypeService goodsTypeService;
    @GetMapping("/list")
    public PageInfo<Goods> getGoods(Goods goods){
        List<Goods> goodss =goodsService.getGoodss(goods);
        PageInfo<Goods> pageInfo = new PageInfo<>(goodss);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Goods> getAll(Goods goods){
//        goods.setActive(1);
        return goodsService.getAll(goods);
    }
    @PostMapping("/add")
    public int add(Goods goods){
        return goodsService.add(goods);
    }
    @GetMapping("/del")
    public int del(Goods goods){
        return goodsService.update(goods);
    }

    @PostMapping("/update")
    public int update(@Valid Goods goods, BindingResult bindingResult){
        return goodsService.update(goods);
    }
    @GetMapping("/getOne")
    public Goods getOne(Integer id){
        return goodsService.getgoodsById(id);
    }
    /*查询相关联的所有商品类型*/
    @GetMapping("/getAllGoodsType")
    public List<GoodsType> getAll(GoodsType goodsType){
//        goodsType.setActive(1);
        return goodsTypeService.getAll(goodsType);
    }
}
