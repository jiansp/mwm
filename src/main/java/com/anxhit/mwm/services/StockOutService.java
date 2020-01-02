package com.anxhit.mwm.services;

import com.anxhit.mwm.cache.Cache;
import com.anxhit.mwm.mapper.MwmStockOutDetailMapper;
import com.anxhit.mwm.mapper.MwmStockOutMapper;
import com.anxhit.mwm.mapper.MwmWasteBagMapper;
import com.anxhit.mwm.model.MwmStockOut;
import com.anxhit.mwm.model.MwmStockOutDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class StockOutService {
    @Autowired
    private MwmStockOutMapper stockOutMapper;
    @Autowired
    private MwmStockOutDetailMapper stockOutDetailMapper;
    @Autowired
    private MwmWasteBagMapper wasteBagMapper;
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Map save(){
        Date now = new Date();
        Map map = new HashMap();
        MwmStockOut stockOut = new MwmStockOut();
        stockOut.setOrgId(Cache.ORG.getId());
        stockOut.setOrgCode(Cache.ORG.getCode());
        stockOut.setHospitalId(Cache.HOSPITAL.getId());
        stockOut.setHospitalCode(Cache.HOSPITAL.getCode());
        stockOut.setStockOutOrder("order"+new Random().nextInt(100));
        stockOut.setTotalWeight(Cache.WASTE_BAG.getWeight());
        stockOut.setTotalBag(1);
        this.stockOutMapper.insert(stockOut);
        map.put("stockOut", stockOut);
        MwmStockOutDetail stockOutDetail = new MwmStockOutDetail();
        stockOutDetail.setStockOutId(stockOut.getId());
        stockOutDetail.setBagId(Cache.WASTE_BAG.getId());
        stockOutDetail.setWeight(Cache.WASTE_BAG.getWeight());
        stockOutDetail.setPointId(Cache.TS_POINT.getId());
        stockOutDetail.setPointNo(Cache.TS_POINT.getPointNo());
        stockOutDetail.setStockOutTime(now);
        this.stockOutDetailMapper.insert(stockOutDetail);
        map.put("stockOutDetail", stockOutDetail);
        Cache.WASTE_BAG.setStatus("5");
        this.wasteBagMapper.updateByPrimaryKey(Cache.WASTE_BAG);
        map.put("wasteBag", Cache.WASTE_BAG);
        return map;
    }
}
