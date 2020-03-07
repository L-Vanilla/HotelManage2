package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.GoodsMapper;
import com.neuedu.pojo.Goods;
import com.neuedu.pojo.GoodsExample;
import com.neuedu.pojo.GoodsType;
import com.neuedu.pojo.GoodsTypeExample;
import com.neuedu.service.GoodsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
/*商品管理
 * 6-14Vanilla
 * */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    GoodsMapper goodsMapper;
    @Override
    public List<Goods> getGoodss(Goods goods) {

        PageHelper.startPage(goods.getPageNo(), goods.getPageSize());
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        if (StringUtils.isNotBlank(goods.getGoodsName())) {
            criteria.andGoodsNameLike("%" + goods.getGoodsName() + "%").andActiveEqualTo(1);
        }if(goods.getGoodsTypeid()!=null){
            criteria.andGoodsTypeidEqualTo(goods.getGoodsTypeid()).andActiveEqualTo(1);
        } else{
            criteria.andActiveEqualTo(1);
        }
//        GoodsTypeExample goodsTypeExample=new GoodsTypeExample();
//        GoodsTypeExample.Criteria criteria_type= goodsTypeExample.createCriteria();

//        if(goods.getActive()!=null)
//            criteria.andActiveEqualTo(goods.getActive());
        return goodsMapper.selectByExample(goodsExample);
    }

    @Override
    public List<Goods> getAll(Goods goods) {
        GoodsExample goodsExample = new GoodsExample();
//        goodsExample.createCriteria().andActiveEqualTo(1);//只查状态为1的
        return goodsMapper.selectByExample(goodsExample);
    }

    @Override
    public Goods getgoodsById(int id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Goods goods) {
        goods.setCreateTime(new Date());
        return goodsMapper.insertSelective(goods);
    }

    @Override
    public int del(Goods goods) {
        return goodsMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public int update(Goods goods) {
        return goodsMapper.updateByPrimaryKeySelective(goods);
    }
}
