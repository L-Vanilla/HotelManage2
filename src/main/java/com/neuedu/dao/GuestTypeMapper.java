package com.neuedu.dao;

import com.neuedu.pojo.GuestType;
import com.neuedu.pojo.GuestTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GuestTypeMapper {
    long countByExample(GuestTypeExample example);

    int deleteByExample(GuestTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GuestType record);

    int insertSelective(GuestType record);

    List<GuestType> selectByExample(GuestTypeExample example);

    GuestType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GuestType record, @Param("example") GuestTypeExample example);

    int updateByExample(@Param("record") GuestType record, @Param("example") GuestTypeExample example);

    int updateByPrimaryKeySelective(GuestType record);

    int updateByPrimaryKey(GuestType record);
}