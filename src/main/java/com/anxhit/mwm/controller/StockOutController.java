package com.anxhit.mwm.controller;

import com.anxhit.mwm.services.StockOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("stockOut")
public class StockOutController {
    @Autowired
    private StockOutService stockOutService;

    @ResponseBody
    @RequestMapping("save")
    public Map save() {
        return this.stockOutService.save();
    }
}
