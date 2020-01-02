package com.anxhit.mwm.controller;

import com.anxhit.mwm.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("review")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @RequestMapping("save")
    @ResponseBody
    public Map save(){
        return this.reviewService.save();
    }
}
