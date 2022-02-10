package com.company.tech.vehicles;

import com.company.tech.Tech;

// Транспортное средство
public class Vehicle extends Tech {

    private String name;
    private int year;


     public Vehicle() {
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

    public Vehicle(String name, int year) {
         this.name = name;
         this.year = year;

 }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", year=" + year +
                "} " + super.toString();
    }
}
