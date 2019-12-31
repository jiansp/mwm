package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MdMwmType;

import java.util.List;

public interface MdMwmTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(MdMwmType record);

    int insertSelective(MdMwmType record);

    MdMwmType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MdMwmType record);

    int updateByPrimaryKey(MdMwmType record);

    List find();
}