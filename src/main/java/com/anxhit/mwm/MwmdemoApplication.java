package com.anxhit.mwm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.anxhit.mwm.mapper")
@SpringBootApplication
public class MwmdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MwmdemoApplication.class, args);
    }

}
