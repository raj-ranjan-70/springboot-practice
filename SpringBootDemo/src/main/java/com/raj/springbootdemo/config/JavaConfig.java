package com.raj.springbootdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class JavaConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails userOne = User.withUsername("User1")
                .password(passwordEncoder().encode("Pass1")).build();

        UserDetails userTwo = User.withUsername("User2")
                .password(passwordEncoder().encode("Pass2")).build();

        UserDetails admin = User.withUsername("Admin1")
                .password(passwordEncoder().encode("AdminPass1")).build();

        return new InMemoryUserDetailsManager(userOne, userTwo, admin);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
