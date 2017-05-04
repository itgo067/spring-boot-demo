package com.wbf.transaction2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
@SpringBootApplication
public class SpringBootTransaction2Application {

    /**
     * 注意
     * 如果在application.yml或者application.properties文件配置 <code>spring.application.name</code>，确保两边的值相同
     */
    private static final String GROUP = "SpringBootTransaction2";

    public SpringBootTransaction2Application() {

    }

    public static void main(final String[] args) throws Exception {
        SpringApplication.run(SpringBootTransaction2Application.class, args);
    }

}
