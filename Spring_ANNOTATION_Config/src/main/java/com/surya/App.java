package com.surya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Person p1 = context.getBean(Person.class);
        System.out.println(p1);

        School school = context.getBean(School.class);
        System.out.println(school);

        Developer dev = context.getBean(Developer.class);
        dev.build();
    }
}
