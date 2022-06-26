package com.fei.springcloud.controller;

import com.fei.springcloud.entities.CommonResult;
import com.fei.springcloud.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/21 8:38
 * @Description
 * @Since version-1.0
 */
@Slf4j
@RestController
@RequestMapping("/openFeign/")
public class OrderController {
    @Resource
    private ConsumerService consumerService;

    @GetMapping("/order/get/{id}")
    public CommonResult get(@PathVariable("id") Long id){
        return consumerService.getPaymentById(id);
    }
}
