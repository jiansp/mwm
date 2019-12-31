package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MdCfgItem;

import java.util.List;

public interface MdCfgItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(MdCfgItem record);

    int insertSelective(MdCfgItem record);

    MdCfgItem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MdCfgItem record);

    int updateByPrimaryKey(MdCfgItem record);

    List find();
}