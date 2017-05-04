package com.wbf.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableScheduling
@EnableLoadTimeWeaving
@EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
@SpringBootApplication
public class SpringBootMybatisTransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisTransactionApplication.class, args);
    }
}
