package com.fei.springcloud.dao;

import com.fei.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/19 9:53
 * @Description
 * @Since version-1.0
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
