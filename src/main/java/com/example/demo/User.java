package com.example.demo;

public class User {
    private String name;
    private int age;
    private boolean cool;

    // Constructor
    public User(String name, int age, boolean cool) {
        this.name = name;
        this.age = age;
        this.cool = cool;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Boolean isCool() {
        return cool;
    }
}
