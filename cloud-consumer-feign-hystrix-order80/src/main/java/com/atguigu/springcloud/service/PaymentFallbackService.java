package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2020/9/29 9:08 下午
 */

@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-------------- PaymentFallbackService fall back_OK";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "-------------- PaymentFallbackService fall back_TimeOut";
    }
}
