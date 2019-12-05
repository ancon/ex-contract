package com.meizan.ancon.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.ZoneAvoidanceRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonRule {

    @Bean
    public IRule myRule() {
        return new ZoneAvoidanceRule();
    }

}
