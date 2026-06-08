package com.gateway.apigateay.utils;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class SecurityConfig {

//   CONFIGURAION WITH SPRING-CLOUD-APIGATEWAY

//    @Bean
//    public SecurityWebFilterChain securityFilterChain(
//            ServerHttpSecurity http) {
//        System.out.println("Enter SecurityWebFilterChain......");
//
//        return http
//                .csrf(ServerHttpSecurity.CsrfSpec::disable)
//                .authorizeExchange(exchange -> exchange
//                        .anyExchange().permitAll()
//                )
//                .build();
//    }

//   CONFIGURAION WITH SPRING-CLOUD-WEBFLUX-REACTIVE-APIGATEWAY

//    @Bean
//    public SecurityFilterChain securityFilterChain(
//            HttpSecurity http)
//            throws Exception {
//
//        return http
//                .csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests(auth ->
//                        auth
//                                .requestMatchers("/auth/**")
//                                .permitAll()
//                                .anyRequest()
//                                .authenticated())
//                .build();
//    }



}
