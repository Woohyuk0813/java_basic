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
    // 직렬화(Serialization) 버전 관리용 ID

    private String name;
    private List<Integer> record;
    private int total;
    private double average;
    private String grade;

    // 이름 + 점수 리스트만 받아서 객체 생성하는 생성자
    // (총점, 평균, 학점은 calculate() 메소드에서 자동 계산됨)
    public Student(String name, List<Integer> record) {
        this.name = name;
        this.record = record;
        calculate(); // 점수 입력받으면 총점, 평균, 학점 자동 계산
    }

    // 총점, 평균, 학점 계산하는 메소드
    public void calculate() {
        // 총점 = record 리스트에 있는 점수들의 합
        total = record.stream().mapToInt(Integer::intValue).sum();

        // 평균 = 총점 ÷ 과목 개수
        average = total / (double) record.size();

        // 학점 계산
        if (average >= 90) grade = "A";
        else if (average >= 80) grade = "B";
        else if (average >= 70) grade = "C";
        else if (average >= 60) grade = "D";
        else grade = "F";
    }

    // Student 객체를 출력할 때 보이는 문자열 형식
    @Override
    public String toString() {
        return String.format("%s, 점수: %s, 총점: %d, 평균: %.1f, 학점: %s",
                name, record, total, average, grade);
    }
}
