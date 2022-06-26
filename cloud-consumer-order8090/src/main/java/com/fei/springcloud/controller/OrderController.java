package com.fei.springcloud.controller;


import com.fei.springcloud.entities.CommonResult;
import com.fei.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/19 12:14
 * @Description
 * @Since version-1.0
 */
@Slf4j
@RestController
@RequestMapping("/consumer")
public class OrderController {
    @Resource
    private RestTemplate restTemplate;

    public static final String PAYMENT_URL = "http://consul-provider-payment";

    @GetMapping("/payment/consul")
    public String consul(Payment payment){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/consul",String.class);
    }

}
