package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author bujiatang
 */

@SpringBootApplication
@EnableDiscoveryClient
public class AccountApplication {
    public static void main(String[] args) {

        SpringApplication.run(AccountApplication.class, args);
    }
}
