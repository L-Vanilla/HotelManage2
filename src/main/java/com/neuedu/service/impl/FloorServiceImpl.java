package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.FloorMapper;
import com.neuedu.pojo.Floor;
import com.neuedu.pojo.FloorExample;
import com.neuedu.service.FloorService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class FloorServiceImpl implements FloorService {
    @Resource
    FloorMapper floorMapper;
    @Override
    public List<Floor> getFloors(Floor floor) {

        PageHelper.startPage(floor.getPageNo(), floor.getPageSize());
        FloorExample floorExample = new FloorExample();
        FloorExample.Criteria criteria = floorExample.createCriteria();
        if (StringUtils.isNotBlank(floor.getFloorName())){
            criteria.andFloorNameLike("%"+floor.getFloorName()+"%").andActiveEqualTo(1);
        }else {
            criteria.andActiveEqualTo(1);
        }

        return floorMapper.selectByExample(floorExample);
    }

    @Override
    public List<Floor> getAll(Floor floor) {
        FloorExample floorExample = new FloorExample();
        return floorMapper.selectByExample(floorExample);
    }

    @Override
    public Floor getfloorById(int id) {
        return floorMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Floor floor) {
        floor.setCreateDate(new Date());
        return floorMapper.insertSelective(floor);
    }

    @Override
    public int del(Floor floor) {
        return floorMapper.updateByPrimaryKeySelective(floor);
    }

    @Override
    public int update(Floor floor) {
        return floorMapper.updateByPrimaryKeySelective(floor);
    }
}
