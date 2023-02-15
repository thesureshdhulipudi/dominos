package com.dominos.common.consul.model.ordermanagement;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
@ConfigurationProperties("config")
public class Config {

    private String companyName = "sd";
    private String legalInfo;
    private String productVersion;
    private String commercialVersion;
}