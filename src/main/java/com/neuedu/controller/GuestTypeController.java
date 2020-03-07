package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.GuestType;
import com.neuedu.service.GuestTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/guestType")
public class GuestTypeController {
    @Resource
    GuestTypeService guestTypeService;
    @GetMapping("/list")
    public PageInfo<GuestType> getGuestType(GuestType guestType){
        List<GuestType> guestTypes =guestTypeService.getGuestTypes(guestType);
        PageInfo<GuestType> pageInfo = new PageInfo<>(guestTypes);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<GuestType> getAll(GuestType guestType){
//        guestType.setActive(1);
        return guestTypeService.getAll(guestType);
    }
    @PostMapping("/add")
    public int add(GuestType guestType){
        return guestTypeService.add(guestType);
    }
    @GetMapping("/del")
    public int del(GuestType guestType){
        return guestTypeService.update(guestType);
    }

    @PostMapping("/update")
    public int update(GuestType guestType){
        return guestTypeService.update(guestType);
    }
    @GetMapping("/getOne")
    public GuestType getOne(Integer id){
        return guestTypeService.getguestTypeById(id);
    }
}
