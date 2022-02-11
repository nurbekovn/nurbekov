package com.company.tech.appliances.sublasses;

import com.company.tech.appliances.Appliances;

public class Fridge extends Appliances {
    private String name;
    private int year;

    public Fridge() {
    }

    public Fridge(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Fridge(String name, int model, String name1, int year, String name2, int year1) {
        super(name, model, name1, year);
        this.name = name2;
        this.year = year1;
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
        return "Fridge{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", year=" + year +
                "} " + super.toString();
    }
}