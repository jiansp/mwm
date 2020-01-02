package com.anxhit.mwm.controller;

import com.anxhit.mwm.cache.Cache;
import com.anxhit.mwm.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("base")
public class BaseController {
    @Autowired
    private BaseService baseService;

    @RequestMapping("save")
    @ResponseBody
    public boolean save(){
         this.baseService.save();
         return true;
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

    @RequestMapping("deleteAll")
    @ResponseBody
    public boolean deleteAll(){
        this.baseService.deleteAll();
        return true;
    }

    @RequestMapping("clearCache")
    @ResponseBody
    public boolean clearCache(){
        this.baseService.clearCache();
        return true;
    }

    @RequestMapping("cacheData")
    @ResponseBody
    public Map cacheData(){
        this.baseService.cacheDate();
        return Cache.BASE_CACHE;
    }

}
