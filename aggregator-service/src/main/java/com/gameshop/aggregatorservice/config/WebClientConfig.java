package com.gameshop.aggregatorservice.config;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Bean
    @LoadBalanced
    public WebClient.Builder getWebClient() {
        return WebClient.builder();
    }
//    @Bean
//    public CircuitBreaker getCircuitBreaker() {
//        CircuitBreaker circuitBreaker = CircuitBreakerRegistry.ofDefaults().circuitBreaker("lol");
//        return circuitBreaker;
//    }
}
