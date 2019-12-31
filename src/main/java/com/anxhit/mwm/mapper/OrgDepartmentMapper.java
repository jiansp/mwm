package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.OrgDepartment;

import java.util.List;

public interface OrgDepartmentMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrgDepartment record);

    int insertSelective(OrgDepartment record);

    OrgDepartment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrgDepartment record);

    int updateByPrimaryKey(OrgDepartment record);

    List find();
}