package com.fei.springcloud;

import com.fei.irule.IRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/19 12:10
 * @Description
 * @Since version-1.0
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = IRuleConfig.class)
public class ConsumerMain8089 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain8089.class,args);
    }
}
