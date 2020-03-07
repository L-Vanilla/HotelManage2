package com.neuedu.test;

import com.neuedu.App;
import com.neuedu.pojo.Goods;
import com.neuedu.service.GoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class GoodsTest {
    @Resource
    GoodsService goodsService;

    @Test
    public void handler(){
        Goods goods  = goodsService.getgoodsById(5);
//            Goods goods = new Goods();
            goods.setId(5);
            goods.setGoodsName("小刀333");
            goods.setNotes("gggggdk");
            goods.setGoodsPrice(new BigDecimal(9));
            goodsService.update(goods);


    }
}
