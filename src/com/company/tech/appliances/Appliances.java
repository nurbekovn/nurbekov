package com.company.tech.appliances;

import com.company.tech.Tech;

//Техника Бытовая
public class Appliances extends Tech {
    private String name;
    private int year;

    public Appliances() {
    }

    public Appliances(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Appliances(String name, int model, String name1, int year) {
        super(name, model);
        this.name = name1;
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
