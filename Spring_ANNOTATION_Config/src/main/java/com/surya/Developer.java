package com.surya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {

    @Autowired
    private Computer com;

    public void build() {
        com.compile();
    }
}
