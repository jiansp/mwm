package com.anxhit.mwm.controller;

import com.anxhit.mwm.services.FaceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("faceData")
public class FaceDataController {
    @Autowired
    private FaceDataService faceDataService;

    @RequestMapping("save")
    @ResponseBody
    public String save(@RequestBody Map map){
        this.faceDataService.save(map);
        return "success";
    }
}
