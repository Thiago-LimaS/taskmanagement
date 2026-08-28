package com.thiago.taskmanagement.config;

import com.thiago.taskmanagement.service.TaskService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) {

        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/tasks").permitAll()
                        .anyRequest().authenticated()
                )

                        .csrf(csrf -> csrf.disable());


        return http.build();
    }

}
