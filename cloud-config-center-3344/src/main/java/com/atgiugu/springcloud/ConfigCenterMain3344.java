package com.atgiugu.springcloud;

import com.atguigu.springcloud.entities.StartTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2020/10/1 12:02 下午
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class, args);
        StartTime startTime = new StartTime();
        startTime.getStartTime("ConfigCenterMain3344");
    }
}
