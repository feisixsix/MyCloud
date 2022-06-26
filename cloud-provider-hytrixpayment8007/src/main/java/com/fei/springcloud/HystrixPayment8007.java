package com.fei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/21 9:39
 * @Description
 * @Since version-1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class HystrixPayment8007 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixPayment8007.class);
    }
}
