package com.surya;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Person {
    @Value("Surya") // Injecting values directly
    private String name;

    @Value("1")
    private int id;

    @Value("21")
    private int age;

    @Value("1234567890")
    private String phNo;

    @Value("#{${gold.Rate}}")
    private Map<Integer,Double>rateInfo ;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", phNo='" + phNo + '\'' +
                ", rateInfo=" + rateInfo +
                '}';
    }
}
