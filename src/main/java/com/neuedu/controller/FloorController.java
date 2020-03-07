package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.Floor;
import com.neuedu.service.FloorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/floor")
public class FloorController {
    @Resource
    FloorService floorService;
    @GetMapping("/list")
    public PageInfo<Floor> getFloor(Floor floor){
        List<Floor> floors =floorService.getFloors(floor);
        PageInfo<Floor> pageInfo = new PageInfo<>(floors);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Floor> getAll(Floor floor){
        return floorService.getAll(floor);
    }
    @PostMapping("/add")
    public int add(Floor floor){
        return floorService.add(floor);
    }
    @GetMapping("/del")
    public int del(Floor floor){
        return floorService.update(floor);
    }

    @PostMapping("/update")
    public int update(Floor floor){
        return floorService.update(floor);
    }
    @GetMapping("/getOne")
    public Floor getOne(Integer id){
        return floorService.getfloorById(id);
    }
}
