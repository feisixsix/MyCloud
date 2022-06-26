package com.fei.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/20 9:34
 * @Description
 * @Since version-1.0
 */
@Slf4j
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String servlet;

    @GetMapping("/payment/consul")
    public String paymentConsul(){
        return "springcloud with consul:" + servlet + "\t" + UUID.randomUUID().toString();
    }
}
