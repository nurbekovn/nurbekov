package com.company.tech.vehicles.sublasses;

import com.company.tech.vehicles.Vehicle;
//грузовик
public class Truck extends Vehicle {
    private String name;
    private int year;

    public Truck() {
    }

    public Truck(String name, int chykkanjyly) {
        this.name = name;
        this.year = chykkanjyly;
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

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + name + '\'' +
                ", year=" + year +
                "} " + super.toString();
    }
}
