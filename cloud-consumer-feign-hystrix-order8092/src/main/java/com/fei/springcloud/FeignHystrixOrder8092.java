package com.fei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/21 10:07
 * @Description
 * @Since version-1.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class FeignHystrixOrder8092 {
    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixOrder8092.class);
    }
}
