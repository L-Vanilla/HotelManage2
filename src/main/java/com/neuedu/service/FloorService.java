package com.neuedu.service;//package com.neuedu.service;

import com.neuedu.pojo.Floor;

import java.util.List;

public interface FloorService {
    List<Floor> getFloors(Floor floor);
    List<Floor> getAll(Floor floor);
    Floor getfloorById(int id);
    int add(Floor floor);
    int del(Floor floor);
    int update(Floor floor);
}
