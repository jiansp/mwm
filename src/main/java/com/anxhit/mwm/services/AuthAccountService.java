package com.anxhit.mwm.services;

import com.anxhit.mwm.mapper.AuthAccountMapper;
import com.anxhit.mwm.model.AuthAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthAccountService {
    @Autowired
    private AuthAccountMapper authAccountMapper;

    public List getAccount(){
        return this.authAccountMapper.find();
    }

    public void save(){
        AuthAccount authAccount = new AuthAccount();
        authAccount.setUserName("admin");
        authAccount.setPassword("123456");
        authAccount.setHospitalId("1234556");
        this.authAccountMapper.insert(authAccount);
    }
}
