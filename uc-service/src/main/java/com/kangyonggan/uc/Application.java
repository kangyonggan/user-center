package com.kangyonggan.uc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kangyonggan
 * @since 7/31/18
 */
@SpringBootApplication
@MapperScan("com.kangyonggan.uc.mapper.*")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
