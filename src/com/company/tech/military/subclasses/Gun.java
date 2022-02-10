package com.company.tech.military.subclasses;

public class Gun extends Military {
    private String name;
    private int pulya;

    public Gun() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPulya() {
        return pulya;
    }

    public void setPulya(int pulya) {
        this.pulya = pulya;
    }

    public Gun(String name, int pulya) {
        this.name = name;
        this.pulya = pulya;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", name='" + name + '\'' +
                ", pulya=" + pulya +
                "} " + super.toString();
    }
}
