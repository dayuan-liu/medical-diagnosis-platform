package com.ldy.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ldy")
@MapperScan("com.ldy.mapper")
public class MedicalDiagnosisPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalDiagnosisPlatformApplication.class, args);
    }


    ///testtest
}
