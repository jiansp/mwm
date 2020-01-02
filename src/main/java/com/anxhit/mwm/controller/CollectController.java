package com.anxhit.mwm.controller;

import com.anxhit.mwm.services.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("collect")
public class CollectController {

    @Autowired
    private CollectService collectService;

    @ResponseBody
    @RequestMapping("save")
    public Map save(){
        return this.collectService.save();
    }
}
