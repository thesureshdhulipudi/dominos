package com.order.mgmt;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.dominos.common", "com.order.mgmt"})
@OpenAPIDefinition(info = @Info(title = "Dominos Order Management", version = "1.0.0"))
@EnableDiscoveryClient
public class OrderManagement {
    public static void main(String[] args) {
        SpringApplication.run(OrderManagement.class, args);
    }


}