package com.kangyonggan.uc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author kangyonggan
 * @since 7/31/18
 */
@SpringBootApplication
//@EnableEurekaClient
@MapperScan("com.kangyonggan.uc.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
