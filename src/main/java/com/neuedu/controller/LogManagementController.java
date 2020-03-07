package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.LogManagement;
import com.neuedu.service.LogManagementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/logManagement")
public class LogManagementController {
    @Resource
    LogManagementService logManagementService;
    
    @GetMapping("/list")
    public PageInfo<LogManagement> getLogManagement(LogManagement logManagement){
        List<LogManagement> logManagements =logManagementService.getLogManagements(logManagement);
        PageInfo<LogManagement> pageInfo = new PageInfo<>(logManagements);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<LogManagement> getAll(LogManagement logManagement){
//        logManagement.setActive(1);
        return logManagementService.getAll(logManagement);
    }
    @PostMapping("/add")
    public int add(LogManagement logManagement){
        return logManagementService.add(logManagement);
    }
    @GetMapping("/del")
    public int del(LogManagement logManagement){
        return logManagementService.update(logManagement);
    }

    @PostMapping("/update")
    public int update(LogManagement logManagement){
        return logManagementService.update(logManagement);
    }
    @GetMapping("/getOne")
    public LogManagement getOne(Integer id){
        return logManagementService.getlogManagementById(id);
    }
}

