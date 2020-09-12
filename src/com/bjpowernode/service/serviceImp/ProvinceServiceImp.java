package com.bjpowernode.service.serviceImp;

import com.bjpowernode.Dao.ProvinceDao;
import com.bjpowernode.Domain.Province;
import com.bjpowernode.Dtuil.SessionUtil;
import com.bjpowernode.service.ProvineService;

import java.util.List;
import java.util.Map;

public class ProvinceServiceImp implements ProvineService {
    private ProvinceDao pd = SessionUtil.getSession().getMapper(ProvinceDao.class);
    @Override
    public List<Province> select() {
        List<Province> list = pd.select();
        return list;
    }

    @Override
    public Province upData(Integer i) {
        Province province= pd.upData(i);
        return province;
    }

    @Override
    public Province remove(Integer i) {
        Province province= pd.remove(i);
        return province;
    }

    @Override
    public void insert(Province p) {
        pd.insert(p);
    }

    @Override
    public List<Map<String, Object>> select1(Map<String, Object> map) {
        return pd.select1(map);

    }

}

