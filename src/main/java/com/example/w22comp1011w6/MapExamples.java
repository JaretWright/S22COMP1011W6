package com.example.w22comp1011w6;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MapExamples {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("COMP 1011", 99);
        grades.put("MGMT 2008", 77);
        grades.put("COMP 2084", 87);
        grades.put("COMP 1008", 88);

        System.out.println(grades);

        System.out.println("The grade for COMP 1008 = " + grades.get("COMP 1008"));

        Collection<Integer> gradeList = grades.values();
        double avg = 0;
        for (Integer grade : gradeList)
            avg += grade;
        System.out.println("The average grade is : " +avg/gradeList.size());

        System.out.println("The avg grade with a stream is: " + grades.values().stream()
                                                                .mapToDouble(Integer::intValue)
                                                                .average());

        System.out.println("The courses taken are: " + grades.keySet());


    }
}
