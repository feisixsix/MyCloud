package com.fei.irule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author LaiXiaoHui
 * @Date 2022/6/20 19:46
 * @Description
 * @Since version-1.0
 */
@Configuration
public class IRuleConfig {
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
