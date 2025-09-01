package student;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
        calculate();
    }

    public void calculate() {
        total = record.stream().mapToInt(Integer::intValue).sum();
        average = total / (double) record.size();

        if (average >= 90) grade = "A";
        else if (average >= 80) grade = "B";
        else if (average >= 70) grade = "C";
        else if (average >= 60) grade = "D";
        else grade = "F";
    }

    @Override
    public String toString() {
        return String.format("%s, 점수: %s, 총점: %d, 평균: %.1f, 학점: %s",
                name, record, total, average, grade);
    }
}

