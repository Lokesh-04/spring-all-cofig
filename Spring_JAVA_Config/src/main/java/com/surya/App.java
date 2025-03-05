package com.surya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Person p1 = context.getBean("person1", Person.class);
        Person p2 = context.getBean("person2", Person.class);
        Person p3 = context.getBean("person3", Person.class);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        School school1 = context.getBean(School.class);
        System.out.println(school1);

        Developer dev = context.getBean(Developer.class);
        dev.build();
    }
}
