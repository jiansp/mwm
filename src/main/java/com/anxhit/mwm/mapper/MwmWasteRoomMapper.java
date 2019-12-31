package com.anxhit.mwm.mapper;

import com.anxhit.mwm.model.MwmWasteRoom;

import java.util.List;

public interface MwmWasteRoomMapper {
    int deleteByPrimaryKey(String id);

    int insert(MwmWasteRoom record);

    int insertSelective(MwmWasteRoom record);

    MwmWasteRoom selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MwmWasteRoom record);

    int updateByPrimaryKey(MwmWasteRoom record);

    List find();
}