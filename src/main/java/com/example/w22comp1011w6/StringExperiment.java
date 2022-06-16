package com.example.w22comp1011w6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StringExperiment {
    public static void main(String[] args) throws FileNotFoundException {
        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.print("s1 == s2: ");
        System.out.println(s1 == s2);
        System.out.println("s1.equals(s2) : " + s1.equals(s2));

        String s3 = "java";
        s3 = s3 + " cool";  //java cool
        System.out.println("s1.equalsIgnoreCase(s3) : " + s1.equalsIgnoreCase(s3));

        System.out.println("\"abc\".compareTo(\"def\") : " + "abc".compareTo("def"));
        System.out.println("\"abc\".compareTo(\"abc\") : " + "abc".compareTo("abc"));
        System.out.println("\"def\".compareTo(\"abc\") : " + "def".compareTo("abc"));

        ArrayList<String> games = new ArrayList<>();
        games.add("League of Legends");
        games.add("Counter Strike");
        games.add("World of Warcraft");

        System.out.println(games);
        Collections.sort(games);
        System.out.println("sorted: " + games);

        Car car1 = new Car("Ford","Lightening", 2022);
        Car car2 = new Car("Audi", "TT", 2021);
        Car car3 = new Car("Audi","S7", 2020);

        ArrayList<Car> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(car1,car2,car3));
        System.out.println("unsorted: " + cars);
        Collections.sort(cars);
        System.out.println("  sorted: " + cars);

        System.out.println("concat method: " + s1.concat(s2));

        System.out.println("s1 (Java) contains \"ava\" : " + s1.contains("ava"));

        System.out.printf("%.2f%n", 87.836782382783782);
        String grade = "87.836782382783782";
        System.out.printf("%s%n", grade.substring(0,5));

        String first = "Jaret";
        String last = "Wright";

        System.out.printf("%s %s initials: %s%s%n", first, last, first.substring(0,1), last.substring(0,1));

        //reads the file
        Scanner fileScanner = new Scanner(new File("names.csv"));
        while (fileScanner.hasNext())
        {
            String fullName = fileScanner.nextLine();
            System.out.println("Full Name scanned: " + fullName);
            String[] nameDivided = fullName.split(",");
            System.out.println("first name: " + nameDivided[0]);
            System.out.println("middle name: " + nameDivided[1]);
            System.out.println("last name: " + nameDivided[2]);
        }
    }
}
