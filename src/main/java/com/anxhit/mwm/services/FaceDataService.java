package com.anxhit.mwm.services;

import com.alibaba.fastjson.JSON;
import com.anxhit.mwm.mapper.MwmFaceDataMapper;
import com.anxhit.mwm.model.MwmFaceDataWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
public class FaceDataService {
    @Autowired
    private MwmFaceDataMapper mwmFaceDataMapper;

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public void save(Map map){
        for (int i = 0; i < 100; i++) {
            String seetaPoints = JSON.toJSONString(map.get("seetaPoints"));
            String seetaImageData = JSON.toJSONString(map.get("RegistSeetaImageData"));
            String username = (String) map.get("username");
            MwmFaceDataWithBLOBs faceData = new MwmFaceDataWithBLOBs();
            faceData.setUsername(username+i);
            faceData.setSeetaImageData(seetaImageData);
            faceData.setSeetaPoints(seetaPoints);
            this.mwmFaceDataMapper.insert(faceData);
        }
    }
}
