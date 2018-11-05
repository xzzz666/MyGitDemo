package com.xz;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudClientApplication_02 {

    public static void main(String[] args) {
        SpringApplication.run(CloudClientApplication_02.class, args);
    }
}
