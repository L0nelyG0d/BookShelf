package com.example.mmm.configuration;

import com.example.mmm.service.CustomUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    private final CustomUserService customUserService;

    public SecurityConfig(CustomUserService customUserService){
        this.customUserService = customUserService;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
            http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/login", "/css/**", "/js/**").permitAll()
                        .anyRequest().authenticated()
                )
                    .formLogin(form -> form
                            .loginPage("/login")
                            .defaultSuccessUrl("/bookShelf", true)
                            .permitAll()
                    )
                    .logout(logout -> logout.permitAll());

            return http.build();


    }
}
