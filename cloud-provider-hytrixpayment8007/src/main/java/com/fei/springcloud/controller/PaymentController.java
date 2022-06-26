package com.fei.springcloud.controller;

import com.fei.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/21 9:44
 * @Description
 * @Since version-1.0
 */
@Slf4j
@RestController
@RequestMapping("/hystrix/")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @GetMapping("/payment/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfoOk(id);
        log.info("****result:{}",result);
        return result;
    }

    @GetMapping("/payment/timeout/{id}")
    public String paymentInfoTimeOut(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfoTimeOut(id);
        log.info("****result:{}",result);
        return result;
    }
}
