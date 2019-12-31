package com.anxhit.mwm.controller;

import com.anxhit.mwm.cache.Cache;
import com.anxhit.mwm.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("save")
    @ResponseBody
    public String save(){
         this.testService.save();
         return "success";
    }

    @RequestMapping("getBase")
    @ResponseBody
    public Map getBase(){
        return Cache.BASE_CACHE;
    }

    @RequestMapping("getFace")
    @ResponseBody
    public List getFace(){
        return Cache.FACE_CACHE;
    }

}
