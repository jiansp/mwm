package com.anxhit.mwm.controller;

import com.anxhit.mwm.services.StockInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("stockIn")
public class StockInController {
    @Autowired
    private StockInService stockInService;

    @RequestMapping("save")
    @ResponseBody
    public Map save() {
        return this.stockInService.save();
    }
}
