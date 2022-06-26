package com.fei.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/20 9:48
 * @Description
 * @Since version-1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerMain8090 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain8090.class,args);
    }
}
