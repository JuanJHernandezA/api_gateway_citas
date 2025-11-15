package com.example.api.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRoutesConfig {

    @Bean
    public RouteLocator customRoutes(RouteLocatorBuilder builder) {
        return builder.routes()

                .route("dates-service", r -> r
                        .path("/api/dates/**")
                        .uri("lb://DATE-SERVICE")
                )


                //.route("auth-service", r -> r
                //        .path("/api/auth/**")
                //        .uri("lb://AUTH-SERVICE")
                //)

                .build();
    }
}
