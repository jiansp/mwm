package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.OrgHospital;

import java.util.List;

public interface OrgHospitalMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrgHospital record);

    int insertSelective(OrgHospital record);

    OrgHospital selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrgHospital record);

    int updateByPrimaryKey(OrgHospital record);

    List find();
}