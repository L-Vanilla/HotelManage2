package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.GoodsType;
import com.neuedu.service.GoodsTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
/*商品类型管理
* 6-14Vanilla
* */
@RestController
@RequestMapping("/goodsType")
public class GoodsTypeController {
    @Resource
    GoodsTypeService goodsTypeService;
    @GetMapping("/list")
    public PageInfo<GoodsType> getGoodsType(GoodsType goodsType){
        List<GoodsType> goodsTypes =goodsTypeService.getGoodsTypes(goodsType);
        PageInfo<GoodsType> pageInfo = new PageInfo<>(goodsTypes);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<GoodsType> getAll(GoodsType goodsType){
//        goodsType.setActive(1);
        return goodsTypeService.getAll(goodsType);
    }
    @PostMapping("/add")
    public int add(GoodsType goodsType){
        return goodsTypeService.add(goodsType);
    }
    @GetMapping("/del")
    public int del(GoodsType goodsType){
        return goodsTypeService.update(goodsType);
    }

    @PostMapping("/update")
    public int update(GoodsType goodsType){
        return goodsTypeService.update(goodsType);
    }
    @GetMapping("/getOne")
    public GoodsType getOne(Integer id){
        return goodsTypeService.getgoodsTypeById(id);
    }
    
}
