package com.surya;

import org.springframework.beans.factory.annotation.Autowired;

public class Developer {

    @Autowired
    Computer com;

    public void build(){
        com.compile();
    }
}
