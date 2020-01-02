package com.anxhit.mwm.init;

import com.anxhit.mwm.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerImpl implements ApplicationRunner {
    @Autowired
    private BaseService testService;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("通过实现ApplicationRunner接口，在spring boot项目启动后执行");
//        this.testService.cacheDate();
    }
}
