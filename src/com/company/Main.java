package com.company;

import com.company.tech.Tech;
import com.company.tech.appliances.Appliances;
import com.company.tech.appliances.sublasses.Fridge;
import com.company.tech.appliances.sublasses.WashingMachine;
import com.company.tech.military.subclasses.Gun;
import com.company.tech.military.subclasses.Military;
import com.company.tech.military.subclasses.Tank;
import com.company.tech.vehicles.Vehicle;
import com.company.tech.vehicles.sublasses.Car;
import com.company.tech.vehicles.sublasses.Truck;

//#ITEM2
//        #CREATE TECH CLASS #PARENTCLASS
//        #CREATE VEHICLES #CHILDCLASS
//        #CREATE APPLIANCES= бытовая техника  #CHILDCLASS
//        #CREATE MILITARY EQUIPMENT=военная техника #CHILDCLASS
//        #LOGIC THINK ABOUT IT
public class Main {

    public static void main(String[] args) {

//        Appliances appliances = new Appliances("Home tech", 10);
//        System.out.println(appliances);

        Tech fridge2 = new Fridge();
        System.out.println(fridge2);

        Appliances fridge = new Fridge("Beko", 2018);
        System.out.println(fridge);

        Fridge fridge1 = new Fridge();
        System.out.println(fridge1);

        Appliances WashingMachine = new WashingMachine("LG", 2022);
        System.out.println(WashingMachine);

        Military military1 = new Military("voen", 1945, "what", 10022022);
        System.out.println(military1);

        Military tank = new Tank("WorldOfTanks Kv-2", 2019);
        System.out.println(tank);

        Military military = new Gun("ak47", 1990);
        System.out.println(military);

        Vehicle vehicle = new Vehicle("transport", 2001);
        System.out.println(vehicle);

        Vehicle car = new Car("bmw", 1990);
        System.out.println(car);

        Vehicle truck = new Truck("volva", 2003);
        System.out.println(truck);

        Tech tech = new Tech("It", 2023);
        System.out.println(tech);
    }
}