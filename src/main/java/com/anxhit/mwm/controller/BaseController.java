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

/*    1初始化数据 localhost:8089/base/save
2清除数据 localhost:8089/base/deleteAll
3缓存数据 localhost:8089/base/cacheData
4清除缓存 localhost:8089/base/clearCache
5创建污物车 localhost:8089/trolley/save
6收集 localhost:8089/collect/save
7核交 localhost:8089/review/save
8入库 localhost:8089/stockIn/save
9出库 localhost:8089/stockOut/save
10异常核交 localhost:8089/review/exceptionSave
11处理异常 localhost:8089/exception/save*/
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
