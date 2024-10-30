package com.dominikcebula.aws.xray.sample.web;

import com.amazonaws.xray.jakarta.servlet.AWSXRayServletFilter;
import jakarta.servlet.Filter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
    @Bean
    public Filter tracingFilter() {
        return new AWSXRayServletFilter("Scorekeep");
    }
}
