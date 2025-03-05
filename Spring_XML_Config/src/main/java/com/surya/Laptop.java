package com.surya;

public class Laptop implements Computer{
    @Override
    public void compile() {
        System.out.println("Using Laptop");
    }
}
