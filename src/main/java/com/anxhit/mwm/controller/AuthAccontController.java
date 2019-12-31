package com.anxhit.mwm.controller;

import com.anxhit.mwm.services.AuthAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("authAccount")
public class AuthAccontController {
    @Autowired
    private AuthAccountService authAccountService;

    @RequestMapping("save")
    @ResponseBody
    public String save(){
        this.authAccountService.save();
        return "success";
    }
}
