package com.fei.springcloud.service;

import com.fei.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/19 10:09
 * @Description
 * @Since version-1.0
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
