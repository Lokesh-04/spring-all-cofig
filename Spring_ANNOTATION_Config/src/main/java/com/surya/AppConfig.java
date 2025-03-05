package com.surya;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "com.surya") // Enables component scanning
@PropertySource("classpath:config.properties")
public class AppConfig {

    @Bean
    public List<Person> persons(Person person1, Person person2) {
        return Arrays.asList(person1, person2);
    }
}
