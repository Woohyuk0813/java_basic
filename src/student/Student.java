package student;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private List<Integer> record; // 과목 점수
    private int total;
    private double average;
    private String grade;

    public Student(String name, List<Integer> record) {
        this.name = name;
        this.record = record;
        calculate(); // 총점, 평균, 학점 계산
    }

    // 총점, 평균, 학점 계산
    public void calculate() {
        total = record.stream().mapToInt(Integer::intValue).sum();
        average = total / (double) record.size();
        if (average >= 90) grade = "A";
        else if (average >= 80) grade = "B";
        else if (average >= 70) grade = "C";
        else if (average >= 60) grade = "D";
        else grade = "F";
    }

    // getter
    public String getName() { return name; }
    public List<Integer> getRecord() { return record; }
    public int getTotal() { return total; }
    public double getAverage() { return average; }
    public String getGrade() { return grade; }

    @Override
    public String toString() {
        return name + " | 점수: " + record + " | 총점: " + total + " | 평균: " + average + " | 학점: " + grade;
    }
}
