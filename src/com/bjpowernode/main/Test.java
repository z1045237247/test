package com.bjpowernode.main;

import com.bjpowernode.Domain.Province;
import com.bjpowernode.Dtuil.ServiceFactory;
import com.bjpowernode.service.ProvineService;
import com.bjpowernode.service.serviceImp.ProvinceServiceImp;


import java.security.Provider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        ProvineService ps = new ProvinceServiceImp();
        ProvineService provineService = (ProvineService) ServiceFactory.service(ps);
        /*List<Province> list = provineService.select();
        for (Province l:list
             ) {
            System.out.println(l);

        }*/
        Map<String,Object> map = new HashMap<>();
        map.put("name","河北");
        List<Map<String,Object>> list = provineService.select1(map);
        for (Map<String,Object> p:list
             ) {
            Set<String> set = p.keySet();
            for (String s:set
                 ) {
                System.out.println("字段---------"+s);
                System.out.println("结果------------"+p.get(s));

            }

        }




    }
}
