package com.anxhit.mwm.services;

import com.anxhit.mwm.cache.Cache;
import com.anxhit.mwm.model.*;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CollectService {

    private OrgOrgnization org = (OrgOrgnization) Cache.BASE_CACHE.get("org").get(0);
    private OrgHospital hospital = (OrgHospital) Cache.BASE_CACHE.get("hospital").get(0);

    public void save(){
        Date now = new Date();

        MwmCollect collect = new MwmCollect();
        collect.setOrgId(org.getId());
        collect.setOrgCode(org.getCode());
        collect.setHospitalId(hospital.getId());
        collect.setHospitalCode(hospital.getCode());
        collect.setStartTime(now);

        MwmCollectDetail collectDetail = new MwmCollectDetail();

        MwmWasteBag wasteBag = new MwmWasteBag();
    }
}
