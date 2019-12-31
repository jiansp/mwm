package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmFaceData;
import com.anxhit.mwm.model.MwmFaceDataWithBLOBs;

import java.util.List;

public interface MwmFaceDataMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmFaceDataWithBLOBs record);

    int insertSelective(MwmFaceDataWithBLOBs record);

    MwmFaceDataWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmFaceDataWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MwmFaceDataWithBLOBs record);

    int updateByPrimaryKey(MwmFaceData record);

    List find();
}