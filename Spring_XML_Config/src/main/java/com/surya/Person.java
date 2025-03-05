package com.surya;

public class Person {
    String name;
    int id;
    int age;
    long phNo;

    public Person(String name, int id, int age, long phNo) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.phNo = phNo;
    }

    public Person() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhNo() {
        return phNo;
    }

    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", phNo=" + phNo +
                '}';
    }
}
