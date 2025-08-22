package javabasic_03.day19.MappingEx;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
class Student {
    private String name;
    private int score;
}

public class MappingEx01 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("aaa", 93));
        students.add(new Student("bbb", 81));
        students.add(new Student("ccc", 99));


        students.stream()
                .mapToInt(student -> student.getScore())
                .forEach(System.out::println);

        int total = students.stream()
                .mapToInt(student -> student.getScore())
                .sum();
        System.out.println("총점: " + total);


        double avg = students.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .orElse(0);
        System.out.println("평균: " + avg);
    }
}

