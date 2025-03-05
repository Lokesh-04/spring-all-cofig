package com.surya;

import java.util.List;
import java.util.Map;

public class School {

    List<String> teachers;
    List<Person> persons;
    Map<String,String> map;

    public School() {
    }

    public School(List<String> teachers, List<Person> persons, Map<String, String> map) {
        this.teachers = teachers;
        this.persons = persons;
        this.map = map;
    }

    public List<String> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<String> teachers) {
        this.teachers = teachers;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "School{" +
                "teachers=" + teachers +
                ", persons=" + persons +
                ", map=" + map +
                '}';
    }
}
