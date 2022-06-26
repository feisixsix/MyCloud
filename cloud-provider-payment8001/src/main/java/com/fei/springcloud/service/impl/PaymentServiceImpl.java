package com.fei.springcloud.service.impl;

import com.fei.springcloud.dao.PaymentDao;
import com.fei.springcloud.entities.Payment;
import com.fei.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/19 10:07
 * @Description
 * @Since version-1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        int result = paymentDao.create(payment);
        return result;
    }

    @Override
    public Payment getPaymentById(Long id) {
        Payment payment = paymentDao.getPaymentById(id);
        return payment;
    }
}
