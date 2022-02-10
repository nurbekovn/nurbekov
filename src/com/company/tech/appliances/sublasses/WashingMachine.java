package com.company.tech.appliances.sublasses;

import com.company.tech.appliances.Appliances;

public class WashingMachine extends Appliances {
    private String name;
    private int year;

    public WashingMachine() {
    }

    public WashingMachine(int year) {
        this.year = year;
    }

    public WashingMachine(String name) {
        this.name = name;
    }


    public WashingMachine(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "name='" + name + '\'' +
                ", year=" + year +
                "} " + super.toString();
    }
}