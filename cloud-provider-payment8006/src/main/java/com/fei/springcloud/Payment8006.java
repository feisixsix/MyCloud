package com.fei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/20 9:33
 * @Description
 * @Since version-1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Payment8006 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8006.class,args);
    }
}
