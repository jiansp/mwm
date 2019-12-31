package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.OrgOrgnization;

import java.util.List;

public interface OrgOrgnizationMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrgOrgnization record);

    int insertSelective(OrgOrgnization record);

    OrgOrgnization selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrgOrgnization record);

    int updateByPrimaryKey(OrgOrgnization record);

    List find();
}