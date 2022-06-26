package com.fei.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/21 10:08
 * @Description
 * @Since version-1.0
 */
@Service
@FeignClient("CLOUD-PAYMENT-HYTRIX")
public interface PaymentHystrixService {
    @GetMapping("/hystrix/payment/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id);

    @GetMapping("/hystrix/payment/timeout/{id}")
    public String paymentInfoTimeOut(@PathVariable("id") Integer id);
}
