package com.anxhit.mwm.controller;

import com.anxhit.mwm.services.ExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("exception")
public class ExceptionController {

    @Autowired
    private ExceptionService exceptionService;

    @ResponseBody
    @RequestMapping("save")
    public Map save(){
        return this.exceptionService.save();
    }
}
