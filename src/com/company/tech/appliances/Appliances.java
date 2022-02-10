package com.company.tech.appliances;

import com.company.tech.Tech;

//Техника
public class Appliances extends Tech {
    private String name;
    private int year;

    public Appliances() {
    }

    public Appliances(String name, int year) {
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

    @Override
    public String toString() {
        return "Appliances  " +
                "name='" + name + '\'' +
                ", year=" + year +
                "} " + super.toString();
    }
}
