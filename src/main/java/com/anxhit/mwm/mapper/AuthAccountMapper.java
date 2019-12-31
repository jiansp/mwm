package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.AuthAccount;

import java.util.List;

public interface AuthAccountMapper {
    int deleteByPrimaryKey(String id);

    int insert(AuthAccount record);

    int insertSelective(AuthAccount record);

    AuthAccount selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AuthAccount record);

    int updateByPrimaryKey(AuthAccount record);

    List find();
}