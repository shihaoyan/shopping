package com.shy.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author 石皓岩
 * @create 2019-12-11 14:42
 * 描述：
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashboardApp_9001 {
    public static void main(String[] args) {
        SpringApplication.run(DashboardApp_9001.class,args);
    }
}
