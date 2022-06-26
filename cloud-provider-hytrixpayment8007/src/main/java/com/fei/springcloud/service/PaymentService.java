package com.fei.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/21 9:41
 * @Description
 * @Since version-1.0
 */
@Service
public class PaymentService {
    public String paymentInfoOk(Integer id){
        return "线程：" + Thread.currentThread().getName() + "paymentInfo_Ok" + id;
    }

    @HystrixCommand(fallbackMethod = "paymentInfoHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String paymentInfoTimeOut(Integer id){
        int A = 10/0;
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "线程：" + Thread.currentThread().getName() + "paymentInfo_Ok" + id + "\t 耗时三秒";
    }
    public String paymentInfoHandler(Integer id){
        return "线程：" + Thread.currentThread().getName() + "paymentInfo_Ok" + id + "\t o(╥﹏╥)o";
    }
}
