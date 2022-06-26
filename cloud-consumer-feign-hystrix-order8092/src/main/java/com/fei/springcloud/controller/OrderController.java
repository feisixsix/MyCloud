package com.fei.springcloud.controller;

import com.fei.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/21 10:09
 * @Description
 * @Since version-1.0
 */
@RestController
@Slf4j
@RequestMapping("/hystrix/")
public class OrderController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/ok/{id}")
    public String consumerInfoOk(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentInfoOk(id);
    }

    @GetMapping("/consumer/timeout/{id}")
    public String consumerInfoTimeout(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentInfoTimeOut(id);
    }
}
