package com.example.w22comp1011w6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExamples {

    // a set is a collection that does not allow duplicates
    public static void main(String[] args) {
        Car car1 = new Car("Ford","Lightening", 2022);
        Car car2 = new Car("Audi", "TT", 2021);
        Car car3 = new Car("Audi","S7", 2020);

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car1);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        System.out.println("List " + carList);

        HashSet<Car> carSet = new HashSet<>();
        carSet.addAll(carList);

        System.out.println("HashSet  " + carSet);

        //if I want the cars to be in an ordered set, we can use a TreeSet
        TreeSet<Car> carTreeSet = new TreeSet<>();
        carTreeSet.addAll(carList);

        System.out.println("TreeSet  " + carTreeSet);
        //let's add another car to the treeset that has the same model year, but different brand
        Car car4 = new Car("Buick","Enclave", 2020);
        carTreeSet.add(car4);
        Car car5 = new Car("Audi","RS4", 2020);
        carTreeSet.add(car5);
        System.out.println("TreeSet  " + carTreeSet);

    }

}
