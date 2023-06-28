package com.example.TeamProject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.expression.WebExpressionAuthorizationManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public UserDetailsService users() {
        UserDetails user = User.builder()
                .username("user")
                .password("{noop}password")
                .roles("USER")
                .build();
        UserDetails admin = User.builder()
                .username("admin")
                .password("{noop}password")
                .roles("USER", "ADMIN")
                .build();
        UserDetails giulio = User.builder()
                .username("giulio")
                .password("{noop}password")
                .roles("USER, ADMIN")
                .build();
        UserDetails riot = User.builder()
                .username("riot")
                .password("{noop}password")
                .roles("USER, ADMIN")
                .build();
        UserDetails alberto = User.builder()
                .username("alberto")
                .password("{noop}password")
                .roles("USER, ADMIN")
                .build();
        UserDetails shpend = User.builder()
                .username("shpend")
                .password("{noop}password")
                .roles("USER, ADMIN")
                .build();
        UserDetails giada = User.builder()
                .username("giada")
                .password("{noop}password")
                .roles("USER, ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user, admin, giulio, riot, alberto, shpend, giada);
    }

    @Bean
    SecurityFilterChain web(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorize -> {
                    try {
                        http.csrf().disable();
                        authorize.requestMatchers("/api/*").hasRole("ADMIN")
                                .anyRequest().authenticated()
                                .and().httpBasic();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
        );
        return http.build();
    }
}

