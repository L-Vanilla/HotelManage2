package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.ConsumeMapper;
import com.neuedu.pojo.Consume;
import com.neuedu.pojo.ConsumeExample;
import com.neuedu.service.ConsumeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class ConsumeServiceImpl implements ConsumeService {
    @Resource
    ConsumeMapper consumeMapper;
    @Override
    public List<Consume> getConsumes(Consume consume) {

        PageHelper.startPage(consume.getPageNo(), consume.getPageSize());
        ConsumeExample consumeExample = new ConsumeExample();
        ConsumeExample.Criteria criteria = consumeExample.createCriteria();
        if(consume.getGoodId()!=null){
            criteria.andGoodIdEqualTo(consume.getGoodId()).andActiveEqualTo(1);
        }if(consume.getGoodTypeid()!=null){
            criteria.andGoodTypeidEqualTo(consume.getGoodTypeid()).andActiveEqualTo(1);
        }if(consume.getLiveId()!=null){
            criteria.andLiveIdEqualTo(consume.getLiveId()).andActiveEqualTo(1);
        }
        if (StringUtils.isNotBlank(consume.getRoomId())) {
            criteria.andRoomIdLike("%"+consume.getRoomId()+"%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        consumeExample.setOrderByClause("id desc");
        return consumeMapper.selectByExample(consumeExample);
    }

    @Override
    public List<Consume> getAll(Consume consume) {
        ConsumeExample consumeExample = new ConsumeExample();
        return consumeMapper.selectByExample(consumeExample);
    }

    //根据房间号live_id查询所有的附加消费
    @Override
    public List<Consume> getAllConsume(Integer liveId) {
        ConsumeExample consumeExample = new ConsumeExample();
        ConsumeExample.Criteria criteria = consumeExample.createCriteria();
        criteria.andLiveIdEqualTo(liveId);
        return consumeMapper.selectByExample(consumeExample);
    }

    @Override
    public Consume getconsumeById(int id) {
        return consumeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Consume consume) {
        consume.setCreateDate(new Date());
        return consumeMapper.insertSelective(consume);
    }

    @Override
    public int del(Consume consume) {
        return consumeMapper.updateByPrimaryKeySelective(consume);
    }

    @Override
    public int update(Consume consume) {
        return consumeMapper.updateByPrimaryKeySelective(consume);
    }
}
