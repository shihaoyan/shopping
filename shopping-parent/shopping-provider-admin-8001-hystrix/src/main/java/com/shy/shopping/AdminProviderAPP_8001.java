package com.shy.shopping;

import com.sun.jdi.connect.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author 石皓岩
 * @create 2019-12-11 11:05
 * 描述：
 */
@SpringBootApplication
@EnableEurekaClient                      //eureka注册服务
@EnableDiscoveryClient                   //服务检索
@EnableCircuitBreaker                    //开启断路器注解
public class AdminProviderAPP_8001 {
    public static void main(String[] args) {
        SpringApplication.run(AdminProviderAPP_8001.class,args);
    }
}
