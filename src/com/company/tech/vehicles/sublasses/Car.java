package com.company.tech.vehicles.sublasses;

import com.company.tech.Tech;
import com.company.tech.vehicles.Vehicle;

public class Car extends Vehicle {
    private String name;
    private int year;

    public Car() {
    }

    public Car(String name, int year)
    {super(name,year);
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;

    }

}
