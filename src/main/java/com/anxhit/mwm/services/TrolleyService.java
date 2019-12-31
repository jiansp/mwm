package com.anxhit.mwm.services;

import com.anxhit.mwm.cache.Cache;
import com.anxhit.mwm.mapper.MwmTrolleyMapper;
import com.anxhit.mwm.model.MwmTrolley;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;


@Service
public class TrolleyService {
    @Autowired
    private MwmTrolleyMapper trolleyMapper;

    public MwmTrolley save(){
        MwmTrolley trolley = new MwmTrolley();
        trolley.setOrgId(Cache.ORG.getId());
        trolley.setOrgCode(Cache.ORG.getCode());
        trolley.setHospitalId(Cache.HOSPITAL.getId());
        trolley.setHospitalCode(Cache.HOSPITAL.getCode());
        trolley.setTrolleyNo("T"+new Random().nextInt(100));
        this.trolleyMapper.insert(trolley);
        Cache.TROLLEY = trolley;
        return trolley;
    }
}
