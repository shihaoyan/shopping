package com.shy.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 石皓岩
 * @create 2019-12-11 9:26
 * 描述：
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp_7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp_7002.class,args);
    }
}
