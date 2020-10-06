package com.atguigu.springcloud;

import com.atguigu.springcloud.entities.StartTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2020/10/1 12:19 上午
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain9527.class,args);
        StartTime startTime = new StartTime();
        startTime.getStartTime("GateWayMain9527");
    }
}
