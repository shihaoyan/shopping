package com.shy.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author 石皓岩
 * @create 2019-12-11 14:56
 * 描述：
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.shy.shopping"})
public class AdminConsumerApp_80 {
    public static void main(String[] args) {
        SpringApplication.run(AdminConsumerApp_80.class,args);
    }
}
