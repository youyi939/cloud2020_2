package com.atguigu.springcloud;

import com.atguigu.springcloud.entities.StartTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2020/10/1 10:57 下午
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3355.class, args);
        StartTime startTime = new StartTime();
        startTime.getStartTime("ConfigCenterMain3355");
    }
}
