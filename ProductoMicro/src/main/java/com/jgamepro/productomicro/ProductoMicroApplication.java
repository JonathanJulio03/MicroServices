package com.jgamepro.productomicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProductoMicroApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductoMicroApplication.class, args);
    }

}
