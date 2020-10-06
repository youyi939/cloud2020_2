package com.atguigu.springcloud;

import com.atguigu.springcloud.entities.StartTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2020/9/24 3:18 下午
 */

    @SpringBootApplication
    @EnableDiscoveryClient
    public class PaymentMain8004 {
        public static void main(String[] args) {
            SpringApplication.run(PaymentMain8004.class,args);
            StartTime startTime = new StartTime();
            startTime.getStartTime("PaymentMain8004");
        }
    }
