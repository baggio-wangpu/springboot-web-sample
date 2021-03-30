package com.example.demo.config;

import com.example.demo.lifecircle.Person;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean(name = "person")
    @ConfigurationProperties(prefix = "person")
    public Person beanLifeCycle() {
        return new Person();
    }
}
