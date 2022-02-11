package com.company.tech.military.subclasses;

import com.company.tech.Tech;
//военный
public class Military extends Tech {
    private String name;
    private int age;

    public Military() {
    }
    
    public Military(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Military(String name, int model, String name1, int age) {
        super(name, model);
        this.name = name1;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Military{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}