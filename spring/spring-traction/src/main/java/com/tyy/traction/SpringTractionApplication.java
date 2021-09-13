package com.tyy.traction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.tyy.traction.mapper")
public class SpringTractionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTractionApplication.class, args);
    }

}
