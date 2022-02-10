package com.company.tech;

public class Tech {
    public String name;
    public int model;

    public Tech() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public Tech(String name, int model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Tech{" +
                "name='" + name + '\'' +
                ", model=" + model +
                '}';
    }
}