package com.atguigu.springcloud;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2020/9/24 3:20 下午
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("%{server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentzk(){
        return "springcloud with zookeeper" +serverPort+"\t"+ UUID.randomUUID().toString();
    }

}
