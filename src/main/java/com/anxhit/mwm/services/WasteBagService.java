package com.anxhit.mwm.services;

import com.anxhit.mwm.mapper.MwmWasteBagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WasteBagService {
    @Autowired
    private MwmWasteBagMapper wasteBagMapper;

    public void save(){

    }
}
