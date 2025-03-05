package com.surya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class School {

    @Value("${app.teachers}")
    private List<String> teachers; // Injected automatically

    @Autowired
    private List<Person> persons;

    @Value("#{${app.map}}")
    private Map<String, String> map;

    @Override
    public String toString() {
        return "School{" +
                "teachers=" + teachers +
                ", persons=" + persons +
                ", map=" + map +
                '}';
    }
}
