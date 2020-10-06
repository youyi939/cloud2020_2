package com.atguigu.springcloud.service;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2020/9/28 9:28 下午
 */
@Service
public class PaymentService {

    //正常访问
    public String paymentInfo_OK(Integer id){
        return "线程池"+Thread.currentThread().getName()+"   paymentInfo_OK,id:  "+id+"\t"+"hhh";
    }

    //异常访问
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    public String paymentInfo_Timeout(Integer id){
        int timenumber=0;
        try {
            TimeUnit.SECONDS.sleep(timenumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池"+Thread.currentThread().getName()+"   paymentInfo_Timeout,id:  "+id+"\t"+"耗时"+timenumber;
    }

    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池"+Thread.currentThread().getName()+"   系统繁忙，请稍后再试,id:  "+id+"\t";
    }



    //    服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreak_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),    //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),      //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),// 失败率达到多少后跳闸
    })
    @GetMapping(value = "/payment/")
    public String paymentCircuitBreaker(@PathVariable("id")Integer id){

        if (id < 0){
            throw new RuntimeException("*********id不得为负数");
        }
        //生成永不重复的ID,使用的是hutool工具包
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName()+"\t"+"调用成功,流水号: "+serialNumber;
    }

    public String paymentCircuitBreak_fallback(@PathVariable("id")Integer id ){
        return "id 不能为负数，请重试，⌚️:  "+id;
    }


}
