package com.shy.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 石皓岩
 * @create 2019-12-11 11:05
 * 描述：
 */
@SpringBootApplication
@EnableEurekaClient                      //eureka注册服务
@EnableDiscoveryClient                   //服务检索
@EnableCircuitBreaker                    //开启断路器注解
public class AdminProviderAPP_8003 {
    public static void main(String[] args) {
        SpringApplication.run(AdminProviderAPP_8003.class,args);
    }
}
