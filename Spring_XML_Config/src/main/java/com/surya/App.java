package com.surya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
       Person p1=(Person)context.getBean("person");
       Person p2=(Person)context.getBean("person2");
        Person p3=(Person)context.getBean("person3");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        School school1=(School)context.getBean("school1");
        System.out.println(school1);
        School school2=(School)context.getBean("school2");
        System.out.println(school2);

    Developer dev=(Developer) context.getBean("dev");
    dev.build();

    }
}
