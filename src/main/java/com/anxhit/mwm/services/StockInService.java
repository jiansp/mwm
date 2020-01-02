package com.anxhit.mwm.services;

import com.anxhit.mwm.cache.Cache;
import com.anxhit.mwm.mapper.MwmStockInDetailMapper;
import com.anxhit.mwm.mapper.MwmStockInMapper;
import com.anxhit.mwm.mapper.MwmWasteBagMapper;
import com.anxhit.mwm.model.MwmStockIn;
import com.anxhit.mwm.model.MwmStockInDetail;
import com.anxhit.mwm.model.MwmTsPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class StockInService {
    @Autowired
    private MwmStockInMapper stockInMapper;
    @Autowired
    private MwmStockInDetailMapper stockInDetailMapper;
    @Autowired
    private MwmWasteBagMapper wasteBagMapper;
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Map save(){
        Date now = new Date();
        Map map = new HashMap();
        MwmStockIn stockIn = new MwmStockIn();
        stockIn.setOrgId(Cache.ORG.getId());
        stockIn.setOrgCode(Cache.ORG.getCode());
        stockIn.setHospitalId(Cache.HOSPITAL.getId());
        stockIn.setHospitalCode(Cache.HOSPITAL.getCode());
        stockIn.setStockInTime(now);
        stockIn.setStockInOrder("order"+new Random().nextInt(100));
        stockIn.setTrolleyId(Cache.TROLLEY.getId());
        stockIn.setTrolleyNo(Cache.TROLLEY.getTrolleyNo());
        stockIn.setCollectId(Cache.COLLECT.getId());
        this.stockInMapper.insert(stockIn);
        map.put("stockIn", stockIn);

        MwmStockInDetail stockInDetail = new MwmStockInDetail();
        stockInDetail.setBagId(Cache.WASTE_BAG.getId());
        stockInDetail.setStockInTime(now);
        stockInDetail.setWeight(Cache.WASTE_BAG.getWeight());
        stockInDetail.setPointId(Cache.TS_POINT.getId());
        stockInDetail.setPointNo(Cache.TS_POINT.getPointNo());
        this.stockInDetailMapper.insert(stockInDetail);
        map.put("stockInDetail", stockInDetail);

       Cache.WASTE_BAG.setStatus("4");
       this.wasteBagMapper.updateByPrimaryKey(Cache.WASTE_BAG);
        map.put("wasteBag", Cache.WASTE_BAG);
        return map;
    }
}
