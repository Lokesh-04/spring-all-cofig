package com.surya;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class Config {
    @Bean
    public Person person1() {
        return new Person("Surya", 1, 21, 1234567890);
    }

    @Bean
    public Person person2() {
        return new Person("Lokesh", 2, 21, 1234567890);
    }

    @Bean
    public Person person3() {
        return new Person("Sasanth", 3, 21, 1234567890);
    }

    @Bean
    public List<String> teachers() {
        return Arrays.asList("teacher1", "teacher2", "teacher3");
    }

    @Bean
    public List<Person> persons() {
        return Arrays.asList(person1(), person2());
    }

    @Bean
    public Map<String, String> map() {
        Map<String, String> map = new HashMap<>();
        map.put("phone", "redmi");
        map.put("lap", "hp");
        return map;
    }

    @Bean
    public School school1() {
        return new School(teachers(), persons(), map());
    }

    @Bean
    public Laptop laptop() {
        return new Laptop();
    }

    @Bean
    @Primary
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean
    public Developer developer() {
        Developer dev = new Developer();
        return dev;
    }
}
