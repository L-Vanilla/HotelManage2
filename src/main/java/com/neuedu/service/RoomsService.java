package com.neuedu.service;//package com.neuedu.service;


import com.neuedu.pojo.Rooms;

import java.util.List;

public interface RoomsService {
    List<Rooms> getRooms(Rooms rooms);
    List<Rooms> getAll(Rooms rooms);
    Rooms getroomsById(int id);
    int add(Rooms rooms);
    int del(Rooms rooms);
    int update(Rooms rooms);
}
