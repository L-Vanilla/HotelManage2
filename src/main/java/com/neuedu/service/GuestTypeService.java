package com.neuedu.service;//package com.neuedu.service;

import com.neuedu.pojo.GuestType;

import java.util.List;

public interface GuestTypeService {
    List<GuestType> getGuestTypes(GuestType guestType);
    List<GuestType> getAll(GuestType guestType);
    GuestType getguestTypeById(int id);
    int add(GuestType guestType);
    int del(GuestType guestType);
//    int del(Integer id);
    int update(GuestType guestType);
}
