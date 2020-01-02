package com.anxhit.mwm.services;

import com.anxhit.mwm.cache.Cache;
import com.anxhit.mwm.mapper.MwmExceptionsMapper;
import com.anxhit.mwm.mapper.MwmWasteBagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
public class ExceptionService {
    @Autowired
    private MwmExceptionsMapper exceptionsMapper;
    @Autowired
    private MwmWasteBagMapper wasteBagMapper;
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Map save(){
        Map map = new HashMap();
        Cache.EXCEPTIONS.setStatus("3");
        Cache.EXCEPTIONS.setExceptionAt("1");
        Cache.EXCEPTIONS.setExceptionDesc("流失了一些液体");
        Cache.EXCEPTIONS.setExceptionType("1");
        this.exceptionsMapper.updateByPrimaryKey(Cache.EXCEPTIONS);
        map.put("exceptions", Cache.EXCEPTIONS);

        Cache.WASTE_BAG.setExceptionStatus("3");
        this.wasteBagMapper.updateByPrimaryKey(Cache.WASTE_BAG);
        map.put("wasteBag", Cache.WASTE_BAG);
        return map;
    }
}
