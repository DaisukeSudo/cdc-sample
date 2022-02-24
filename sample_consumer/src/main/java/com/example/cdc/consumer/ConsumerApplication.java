package com.example.cdc.consumer;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ConsumerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ConsumerApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.setLogStartupInfo(false);
        springApplication.run(args);
    }

    GreetingClient greetingClient;

    @Override
    public void run(String... args) {
        System.out.println(
                greetingClient.getMessage().block()
        );
    }
}
