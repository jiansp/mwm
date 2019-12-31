package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MdDictSingle;

import java.util.List;

public interface MdDictSingleMapper {
    int deleteByPrimaryKey(String id);

    int insert(MdDictSingle record);

    int insertSelective(MdDictSingle record);

    MdDictSingle selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MdDictSingle record);

    int updateByPrimaryKey(MdDictSingle record);

    List find();
}