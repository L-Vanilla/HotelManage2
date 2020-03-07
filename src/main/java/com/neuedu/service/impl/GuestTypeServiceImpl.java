package com.neuedu.service.impl;//package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.GuestTypeMapper;
import com.neuedu.pojo.GuestType;
import com.neuedu.pojo.GuestTypeExample;
import com.neuedu.service.GuestTypeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class GuestTypeServiceImpl implements GuestTypeService {
    @Resource
    GuestTypeMapper guestTypeMapper;
    @Override
    public List<GuestType> getGuestTypes(GuestType guestType) {

        PageHelper.startPage(guestType.getPageNo(), guestType.getPageSize());
        GuestTypeExample guestTypeExample = new GuestTypeExample();
        GuestTypeExample.Criteria criteria = guestTypeExample.createCriteria();
        if (StringUtils.isNotBlank(guestType.getTypeName())){
            criteria.andTypeNameLike("%"+guestType.getTypeName()+"%").andActiveEqualTo(1);
        }else {
            criteria.andActiveEqualTo(1);
        }

        return guestTypeMapper.selectByExample(guestTypeExample);
    }

    @Override
    public List<GuestType> getAll(GuestType guestType) {
        GuestTypeExample guestTypeExample = new GuestTypeExample();
//        guestTypeExample.createCriteria().andActiveEqualTo(1);//只查状态为1的
        return guestTypeMapper.selectByExample(guestTypeExample);
    }

    @Override
    public GuestType getguestTypeById(int id) {
        return guestTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(GuestType guestType) {
        guestType.setCreateTime(new Date());
        return guestTypeMapper.insertSelective(guestType);
    }

    @Override
    public int del(GuestType guestType) {
        return guestTypeMapper.updateByPrimaryKeySelective(guestType);
    }

    @Override
    public int update(GuestType guestType) {
        return guestTypeMapper.updateByPrimaryKeySelective(guestType);
    }
}
