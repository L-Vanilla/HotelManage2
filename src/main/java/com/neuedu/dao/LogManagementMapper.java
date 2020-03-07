package com.neuedu.dao;

import com.neuedu.pojo.LogManagement;
import com.neuedu.pojo.LogManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogManagementMapper {
    long countByExample(LogManagementExample example);

    int deleteByExample(LogManagementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogManagement record);

    int insertSelective(LogManagement record);

    List<LogManagement> selectByExample(LogManagementExample example);

    LogManagement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogManagement record, @Param("example") LogManagementExample example);

    int updateByExample(@Param("record") LogManagement record, @Param("example") LogManagementExample example);

    int updateByPrimaryKeySelective(LogManagement record);

    int updateByPrimaryKey(LogManagement record);
}