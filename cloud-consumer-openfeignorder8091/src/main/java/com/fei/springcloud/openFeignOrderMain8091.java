package com.fei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/21 8:36
 * @Description
 * @Since version-1.0
 */
@SpringBootApplication
@EnableFeignClients
public class openFeignOrderMain8091 {
    public static void main(String[] args) {
        SpringApplication.run(openFeignOrderMain8091.class);
    }
}
