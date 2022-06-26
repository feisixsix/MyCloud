package com.fei.springcloud.service;

import com.fei.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/21 8:37
 * @Description
 * @Since version-1.0
 */
@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface ConsumerService {
    @GetMapping("/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);
}
