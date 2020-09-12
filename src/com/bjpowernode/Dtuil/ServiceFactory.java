package com.bjpowernode.Dtuil;

import com.bjpowernode.service.serviceImp.ProvinceServiceImp;

public class ServiceFactory {
    public static Object service(Object serviceImp){
        return new DongTaiDaiLi(serviceImp).getProxy();
    }
}
