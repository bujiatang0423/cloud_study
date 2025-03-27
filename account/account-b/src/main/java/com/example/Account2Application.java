package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author bujiatang
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Account2Application {
    public static void main(String[] args) {

        SpringApplication.run(Account2Application.class, args);
    }
}
