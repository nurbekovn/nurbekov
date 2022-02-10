package com.company.tech.military.subclasses;

public class Tank extends Military {
    private String name;
    private int weight;

    public Tank() {
    }

    public Tank(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                "} " + super.toString();
    }
}