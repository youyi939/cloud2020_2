package com.atguigu.springcloud;

import com.atguigu.springcloud.entities.StartTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/6 10:19 上午
 */

@EnableEurekaClient
@SpringBootApplication
public class StreamMQMain8802 {

        public static void main(String[] args) {
            SpringApplication.run(StreamMQMain8802.class,args);
            StartTime startTime = new StartTime();
            startTime.getStartTime("StreamMQMain8802");
        }

}
