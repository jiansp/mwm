package com.anxhit.mwm.services;

import com.anxhit.mwm.mapper.*;
import com.anxhit.mwm.model.*;
import com.anxhit.mwm.cache.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private OrgOrgnizationMapper orgOrgnizationMapper;
    @Autowired
    private OrgHospitalMapper orgHospitalMapper;
    @Autowired
    private OrgDepartmentMapper orgDepartmentMapper;
    @Autowired
    private MwmWasteRoomMapper mwmWasteRoomMapper;
    @Autowired
    private MwmWasteRoomDeptMapper mwmWasteRoomDeptMapper;
    @Autowired
    private MdCfgItemMapper mdCfgItemMapper;
    @Autowired
    private AuthAccountMapper authAccountMapper;
    @Autowired
    private MdMwmTypeMapper mdMwmTypeMapper;
    @Autowired
    private MdDictSingleMapper mdDictSingleMapper;
    @Autowired
    private MwmFaceDataMapper mwmFaceDataMapper;

    public void cacheDate(){
        List org = this.orgOrgnizationMapper.find();
        Cache.BASE_CACHE.put("org", org);
        List hospital = this.orgHospitalMapper.find();
        Cache.BASE_CACHE.put("hospital", hospital);
        List department = this.orgDepartmentMapper.find();
        Cache.BASE_CACHE.put("department", department);
        List wasteRoom = this.mwmWasteRoomMapper.find();
        Cache.BASE_CACHE.put("wasteRoom", wasteRoom);
        List account = this.authAccountMapper.find();
        Cache.BASE_CACHE.put("account", account);
        List config = this.mdCfgItemMapper.find();
        Cache.BASE_CACHE.put("config", config);
        List dict = this.mdDictSingleMapper.find();
        Cache.BASE_CACHE.put("dict", dict);
        List type = this.mdMwmTypeMapper.find();
        Cache.BASE_CACHE.put("type", type);
        List list = this.mwmFaceDataMapper.find();
        Cache.FACE_CACHE = list;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void save() {

        OrgOrgnization orgOrgnization = new OrgOrgnization();
        orgOrgnization.setCode("abcd");
        orgOrgnization.setName("anxHit");
        this.orgOrgnizationMapper.insert(orgOrgnization);

        OrgHospital orgHospital = new OrgHospital();
        orgHospital.setName("天津资源中心");
        orgHospital.setOrgId(orgOrgnization.getId());
        orgHospital.setOrgCode(orgOrgnization.getCode());
        orgHospital.setCode("1234");
        this.orgHospitalMapper.insert(orgHospital);

        for (int i = 0; i < 100; i++) {
            OrgDepartment orgDepartment = new OrgDepartment();
            orgDepartment.setCode("9089766"+i);
            orgDepartment.setName("科室" + i);
            orgDepartment.setHospitalId(orgHospital.getId());
            orgDepartment.setHospitalCode(orgHospital.getCode());
            this.orgDepartmentMapper.insert(orgDepartment);

            AuthAccount authAccount = new AuthAccount();
            authAccount.setUserName("admin" + i);
            authAccount.setPassword("123456");
            authAccount.setHospitalId("1234556");
            this.authAccountMapper.insert(authAccount);
        }

        for (int j = 0; j < 50; j++) {
            MwmWasteRoom mwmWasteRoom = new MwmWasteRoom();
            mwmWasteRoom.setCode("adf"+j);
            mwmWasteRoom.setOrgId(orgOrgnization.getId());
            mwmWasteRoom.setOrgCode(orgOrgnization.getCode());
            mwmWasteRoom.setHospitalId(orgHospital.getId());
            mwmWasteRoom.setHospitalCode(orgHospital.getCode());
            mwmWasteRoom.setName("污物间"+j);
            this.mwmWasteRoomMapper.insert(mwmWasteRoom);
        }

        for (int k = 0; k < 6; k++) {
            MdMwmType mdMwmType = new MdMwmType();
            mdMwmType.setCode(String.valueOf(k));
            mdMwmType.setName("类别"+k);
            this.mdMwmTypeMapper.insert(mdMwmType);
        }

        for (int m=0;m<20;m++){
            MdCfgItem mdCfgItem = new MdCfgItem();
            mdCfgItem.setCode("code"+m);
            mdCfgItem.setName("参数"+m);
            mdCfgItem.setOrgId(orgOrgnization.getId());
            mdCfgItem.setOrgCode(orgOrgnization.getCode());
            mdCfgItem.setHospitalId(orgHospital.getId());
            mdCfgItem.setHospitalCode(orgHospital.getCode());
            this.mdCfgItemMapper.insert(mdCfgItem);

            MdDictSingle mdDictSingle = new MdDictSingle();
            mdDictSingle.setKey("key"+m);
            mdDictSingle.setValue("val"+m);
            mdDictSingle.setOrgId(orgOrgnization.getId());
            mdDictSingle.setOrgCode(orgOrgnization.getCode());
            mdDictSingle.setHospitalId(orgHospital.getId());
            mdDictSingle.setHospitalCode(orgHospital.getCode());
            mdDictSingle.setItemId("asddffffasdfasdfasdf"+m);
            this.mdDictSingleMapper.insert(mdDictSingle);
        }

    }
}
