package com.order.mgmt;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
@ConfigurationProperties("order-mgmt-properties")
public class Config2 {

    private String name;
}