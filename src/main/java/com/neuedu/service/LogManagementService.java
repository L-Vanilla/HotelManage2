package com.neuedu.service;

import com.neuedu.pojo.LogManagement;

import java.util.List;

public interface LogManagementService {
    List<LogManagement> getLogManagements(LogManagement logManagement);
    List<LogManagement> getAll(LogManagement logManagement);
    LogManagement getlogManagementById(int id);
    int add(LogManagement logManagement);
    int del(LogManagement logManagement);
    //    int del(Integer id);
    int update(LogManagement logManagement);
}
