package com.neuedu.dao;

import com.neuedu.pojo.Leaguer;
import com.neuedu.pojo.LeaguerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaguerMapper {
    long countByExample(LeaguerExample example);

    int deleteByExample(LeaguerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Leaguer record);

    int insertSelective(Leaguer record);

    List<Leaguer> selectByExample(LeaguerExample example);

    Leaguer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Leaguer record, @Param("example") LeaguerExample example);

    int updateByExample(@Param("record") Leaguer record, @Param("example") LeaguerExample example);

    int updateByPrimaryKeySelective(Leaguer record);

    int updateByPrimaryKey(Leaguer record);
}