package com.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream().map(grade -> grade < 38 || grade % 5 < 3 ? grade : grade + (5 - (grade % 5))
        ).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> studentGrades = new ArrayList<Integer>();
        studentGrades.add(73);
        studentGrades.add(67);
        studentGrades.add(38);
        studentGrades.add(33);

        System.out.println(gradingStudents(studentGrades));

    }
}
