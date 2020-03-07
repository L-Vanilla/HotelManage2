package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.GoodsTypeMapper;
import com.neuedu.pojo.GoodsType;
import com.neuedu.pojo.GoodsTypeExample;
import com.neuedu.service.GoodsTypeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
/*商品类型管理
 * 6-14Vanilla
 * */
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Resource
    GoodsTypeMapper goodsTypeMapper;
    @Override
    public List<GoodsType> getGoodsTypes(GoodsType goodsType) {

        PageHelper.startPage(goodsType.getPageNo(), goodsType.getPageSize());
        GoodsTypeExample goodsTypeExample = new GoodsTypeExample();
        GoodsTypeExample.Criteria criteria = goodsTypeExample.createCriteria();
        if (StringUtils.isNotBlank(goodsType.getGoodsTypename())) {
            criteria.andGoodsTypenameLike("%" + goodsType.getGoodsTypename() + "%").andActiveEqualTo(1);
        }else {
            criteria.andActiveEqualTo(1);
        }
//        if(goodsType.getActive()!=null)
//            criteria.andActiveEqualTo(goodsType.getActive());

        return goodsTypeMapper.selectByExample(goodsTypeExample);
    }

    @Override
    public List<GoodsType> getAll(GoodsType goodsType) {
        GoodsTypeExample goodsTypeExample = new GoodsTypeExample();
        goodsTypeExample.createCriteria().andActiveEqualTo(1);//只查状态为1的
        return goodsTypeMapper.selectByExample(goodsTypeExample);
    }

    @Override
    public GoodsType getgoodsTypeById(int id) {
        return goodsTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(GoodsType goodsType) {
        goodsType.setCreateTime(new Date());
        return goodsTypeMapper.insertSelective(goodsType);
    }

    @Override
    public int del(GoodsType goodsType) {
        return goodsTypeMapper.updateByPrimaryKeySelective(goodsType);
    }

    @Override
    public int update(GoodsType goodsType) {
        return goodsTypeMapper.updateByPrimaryKeySelective(goodsType);
    }
    
}
