package com.bjpowernode.service;

import com.bjpowernode.Domain.Province;

import java.util.List;
import java.util.Map;

public interface ProvineService {
    List<Province> select();
    Province upData(Integer i);
    Province remove(Integer i);
    void insert(Province p);

    List<Map<String, Object>> select1(Map<String, Object> map);
}
