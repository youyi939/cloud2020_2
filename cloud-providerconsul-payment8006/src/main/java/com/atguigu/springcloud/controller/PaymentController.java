package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2020/9/26 10:06 上午
 */
@RestController
public class PaymentController {
    @Value("%{server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentConsul(){
        return "springcloud with consul" +serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
