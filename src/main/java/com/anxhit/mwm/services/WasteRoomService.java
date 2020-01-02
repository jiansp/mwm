package com.anxhit.mwm.services;

import com.anxhit.mwm.cache.Cache;
import com.anxhit.mwm.model.MwmWasteRoom;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class WasteRoomService {
    public MwmWasteRoom getWasteRoom(){
        MwmWasteRoom wasteRoom = (MwmWasteRoom) Cache.BASE_CACHE.get("wasteRoom").get(new Random().nextInt(49));
        Cache.WASTE_ROOM = wasteRoom;
        return wasteRoom;
    }
}
