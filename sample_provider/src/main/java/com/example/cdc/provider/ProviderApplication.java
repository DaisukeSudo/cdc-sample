package com.example.cdc.provider;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ProviderApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.setLogStartupInfo(false);
        springApplication.run(args);
    }
}
