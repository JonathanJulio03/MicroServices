package com.jgamepro.customermicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CustomerMicroApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerMicroApplication.class, args);
    }

}
