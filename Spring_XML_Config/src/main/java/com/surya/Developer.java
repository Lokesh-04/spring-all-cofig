package com.surya;

public class Developer {

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    Computer com;

    public void build(){
        com.compile();
    }
}
