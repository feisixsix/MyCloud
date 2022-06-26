package com.fei.springcloud.controller;

import com.fei.springcloud.entities.CommonResult;
import com.fei.springcloud.entities.Payment;
import com.fei.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/19 10:14
 * @Description
 * @Since version-1.0
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String servlet;

    @PostMapping("/create")
    public CommonResult createPayment(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果:{}",result);

        if (result > 0){
            return new CommonResult(200,"插入数据成功,servlet:" + servlet,result);
        }else {
            return new CommonResult(444,"插入数据失败,servlet:" + servlet);
        }
    }

    @GetMapping("/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("获取结果:{}",payment);

        if (payment != null){
            return new CommonResult(200,"查询数据成功,servlet:" + servlet,payment);
        }else {
            return new CommonResult(444,"查询数据失败,servlet:" + servlet);
        }
    }

}
