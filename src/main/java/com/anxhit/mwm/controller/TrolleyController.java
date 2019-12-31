package com.anxhit.mwm.controller;

import com.anxhit.mwm.cache.Cache;
import com.anxhit.mwm.model.MwmTrolley;
import com.anxhit.mwm.services.TrolleyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("trolley")
public class TrolleyController {
    @Autowired
    private TrolleyService trolleyService;

    @RequestMapping("save")
    @ResponseBody
    public MwmTrolley save(){
        MwmTrolley trolley = this.trolleyService.save();
        return trolley;
    }
    
}
