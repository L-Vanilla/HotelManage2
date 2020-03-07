package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.Floor;
import com.neuedu.pojo.GuestType;
import com.neuedu.pojo.Rooms;
import com.neuedu.service.FloorService;
import com.neuedu.service.GuestTypeService;
import com.neuedu.service.RoomsService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * zyp
 * 客房管理
 * 2019-6-17
 */

@RestController
@RequestMapping("/rooms")
public class RoomsController {
    @Resource
    RoomsService roomsService;
    @Resource
    FloorService floorService;
    @Resource
    GuestTypeService guestTypeService;
    @GetMapping("/list")
    public PageInfo<Rooms> getFloor(Rooms rooms){
        List<Rooms> roomss =roomsService.getRooms(rooms);
        PageInfo<Rooms> pageInfo = new PageInfo<>(roomss);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Rooms> getAll(Rooms rooms){
        return roomsService.getAll(rooms);
    }

    @PostMapping("/add")
    public int add(Rooms rooms){
        return roomsService.add(rooms);
    }
    @GetMapping("/del")
    public int del(Rooms rooms){
        return roomsService.update(rooms);
    }

    @PostMapping("/update")
    public int update(@Valid Rooms rooms, BindingResult bindingResult){
        return roomsService.update(rooms);
    }
    @GetMapping("/getOne")
    public Rooms getOne(Integer id){
        return roomsService.getroomsById(id);
    }

    //查询所有未预定的房间
    @GetMapping("/getUsefulAll")
    public List<Rooms> getUsefulAll(Rooms rooms){
        rooms.setStatus(0);
        return roomsService.getAll(rooms);
    }

    /*查询相关联的所有楼层信息 zyp未用该接口*/
    @GetMapping("/getAllFloor")
    public List<Floor> getAll(Floor floor){
        return floorService.getAll(floor);
    }

    /*查询相关联的所有有效楼层信息*/
    @GetMapping("/getUsefulAllFloor")
    public List<Floor> getUsefulAll(Floor floor){
        floor.setActive(1);
        return floorService.getAll(floor);
    }

    /*查询相关联的所有房间类型信息 zyp未用该接口*/
    @GetMapping("/getAllGuestType")
    public List<GuestType> getAll(GuestType guestType){
        return guestTypeService.getAll(guestType);
    }
    /*查询相关联的所有有效房间类型信息*/
    @GetMapping("/getUsefulAllGuestType")
    public List<GuestType> getUsefulAll(GuestType guestType){
        guestType.setActive(1);
        return guestTypeService.getAll(guestType);
    }
}
