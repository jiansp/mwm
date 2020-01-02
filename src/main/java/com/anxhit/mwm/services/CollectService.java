package com.anxhit.mwm.services;

import com.anxhit.mwm.cache.Cache;
import com.anxhit.mwm.mapper.MwmCollectDetailMapper;
import com.anxhit.mwm.mapper.MwmCollectMapper;
import com.anxhit.mwm.mapper.MwmTrolleyMapper;
import com.anxhit.mwm.mapper.MwmWasteBagMapper;
import com.anxhit.mwm.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;

@Service
public class CollectService {
    @Autowired
    private MwmCollectMapper collectMapper;
    @Autowired
    private MwmWasteBagMapper wasteBagMapper;
    @Autowired
    private MwmCollectDetailMapper collectDetailMapper;
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Map save(){
        Map res = new HashMap();
        Date now = new Date();
        MwmCollect collect = new MwmCollect();
        collect.setOrgId(Cache.ORG.getId());
        collect.setOrgCode(Cache.ORG.getCode());
        collect.setHospitalId(Cache.HOSPITAL.getId());
        collect.setHospitalCode(Cache.HOSPITAL.getCode());
        collect.setStartTime(now);
        if (Cache.TROLLEY == null){
            throw new RuntimeException("没有转运车信息");
        }
        collect.setTrolleyId(Cache.TROLLEY.getId());
        collect.setTrolleyNo(Cache.TROLLEY.getTrolleyNo());
        this.collectMapper.insert(collect);
        Cache.COLLECT = collect;
        res.put("collect",collect);

        MwmWasteBag wasteBag = new MwmWasteBag();
        wasteBag.setOrgId(Cache.ORG.getId());
        wasteBag.setOrgCode(Cache.ORG.getCode());
        wasteBag.setHospitalId(Cache.HOSPITAL.getId());
        wasteBag.setHospitalCode(Cache.HOSPITAL.getCode());
        wasteBag.setWrId(Cache.WASTE_ROOM.getId());
        wasteBag.setWrCode(Cache.WASTE_ROOM.getCode());
        wasteBag.setWrName(Cache.WASTE_ROOM.getName());
        wasteBag.setTypeId(Cache.MWM_TYPE.getId());
        wasteBag.setTypeCode(Cache.MWM_TYPE.getCode());
        wasteBag.setTypeName(Cache.MWM_TYPE.getName());
        wasteBag.setWeight(new BigDecimal("18.23"));
        wasteBag.setQrCode("1934874589"+new Random().nextInt(100));
        wasteBag.setCollectTime(now);
        wasteBag.setStatus("2");
        wasteBag.setExceptionStatus("9");
        this.wasteBagMapper.insert(wasteBag);
        Cache.WASTE_BAG = wasteBag;
        res.put("wasteBag", wasteBag);

        MwmCollectDetail collectDetail = new MwmCollectDetail();
        collectDetail.setCollectId(collect.getId());
        collectDetail.setWrId(Cache.WASTE_ROOM.getId());
        collectDetail.setWrCode(Cache.WASTE_ROOM.getCode());
        collectDetail.setWrName(Cache.WASTE_ROOM.getName());
        collectDetail.setBagId(wasteBag.getId());
        collectDetail.setTypeId(Cache.MWM_TYPE.getId());
        collectDetail.setTypeCode(Cache.MWM_TYPE.getCode());
        collectDetail.setTypeName(Cache.MWM_TYPE.getName());
        collectDetail.setWeight(wasteBag.getWeight());
        collectDetail.setQrCode(wasteBag.getQrCode());
        collectDetail.setCollectTime(now);
        this.collectDetailMapper.insert(collectDetail);
        res.put("collectDetail",collectDetail);
        return res;
    }
}
