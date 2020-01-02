package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.AuthAccount;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseMapper {
    List findTableName();

    void deleteByTableName(@Param("tableName") String tableName);
}