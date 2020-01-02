package com.anxhit.mwm.controller;

import com.anxhit.mwm.model.MwmWasteRoom;
import com.anxhit.mwm.services.WasteRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("wasteRoom")
public class WasteRoomController {
    @Autowired
    private WasteRoomService wasteRoomService;

    @RequestMapping("getWasteRoom")
    @ResponseBody
    public MwmWasteRoom getWasteRoom(){
        MwmWasteRoom wasteRoom = this.wasteRoomService.getWasteRoom();
        return wasteRoom;
    }
}
