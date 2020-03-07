package com.neuedu.service;//package com.neuedu.service;

import com.neuedu.pojo.Consume;

import java.util.List;

public interface ConsumeService {
    List<Consume> getConsumes(Consume consume);
    List<Consume> getAll(Consume consume);
    List<Consume> getAllConsume(Integer liveId); //根据房间号live_id查询所有的附加消费
    Consume getconsumeById(int id);
    int add(Consume consume);
    int del(Consume consume);
    int update(Consume consume);
}
