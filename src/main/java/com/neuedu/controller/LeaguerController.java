package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.Leaguer;
import com.neuedu.service.LeaguerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/leaguer")
public class LeaguerController {
    @Resource
    LeaguerService leaguerService;
    @GetMapping("/list")
    public PageInfo<Leaguer> getFloor(Leaguer leaguer){
        List<Leaguer> leaguers =leaguerService.getLeaguers(leaguer);
        PageInfo<Leaguer> pageInfo = new PageInfo<>(leaguers);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Leaguer> getAll(Leaguer leaguer){
        return leaguerService.getAll(leaguer);
    }
    @PostMapping("/add")
    public int add(Leaguer leaguer){
        leaguer.setLeaguerRank("普通");
        return leaguerService.add(leaguer);
    }
    @GetMapping("/del")
    public int del(Leaguer leaguer){
        return leaguerService.update(leaguer);
    }

    @PostMapping("/update")
    public int update(Leaguer leaguer){
        return leaguerService.update(leaguer);
    }
    @GetMapping("/getOne")
    public Leaguer getOne(Integer id){
        return leaguerService.getleaguerById(id);
    }
}
