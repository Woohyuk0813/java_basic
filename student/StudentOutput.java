package student;  // student 패키지에 속한 클래스

import java.io.*;   // 파일 입출력(ObjectInputStream 등)
import java.util.*; // HashMap, ArrayList, Comparator 등 사용

// 학생 정보를 불러와서 정렬 후 성적표 출력하는 클래스
public class StudentOutput {

    // key: 학생 이름, value: Student 객체
    private HashMap<String, Student> studentInfo;

    // 정렬된 학생들을 담을 리스트
    private List<Student> datas;

    // 1. student.dat 파일에서 학생 정보 불러오기
    private void loadStudentData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Temp/student.dat"))) {
            // student.dat 파일에 저장된 HashMap<String, Student> 읽어오기
            studentInfo = (HashMap<String, Student>) ois.readObject();
        } catch (Exception e) {
            // 파일이 없거나 읽는 도중 오류가 나면 실행됨
            System.out.println("파일 로드 실패");
            studentInfo = new HashMap<>(); // 비어 있는 HashMap 생성
        }
    }

    // 2. 학생 데이터를 평균 기준으로 정렬
    private void sortStudentData() {
        // HashMap의 value(Student 객체들)를 꺼내와서 ArrayList에 담음
        datas = new ArrayList<>(studentInfo.values());

        // Comparator 사용 → 평균 오름차순으로 정렬
        datas.sort(Comparator.comparingDouble(Student::getAverage));
    }

    // 3. 정렬된 학생 정보 출력
    private void printInfo() {
        System.out.println("[평균 오름차순 성적표]");
        int idx = 1; // 순번 출력용

        for (Student s : datas) {
            System.out.println(idx + ") " + s.getName()); // 이름 출력
            System.out.println("   점수: " + s.getRecord()); // 개별 점수들 출력
            System.out.printf("   총점: %d, 평균: %.1f, 학점: %s\n",
                    s.getTotal(),     // 총점
                    s.getAverage(),   // 평균
                    s.getGrade());    // 학점(A~F)
            idx++;
        }
    }

    // 실행 흐름
    public void run() {
        loadStudentData();   // 1. 파일에서 데이터 불러오기
        sortStudentData();   // 2. 평균 기준 정렬
        printInfo();         // 3. 결과 출력
    }

    // 프로그램 시작점 (main 메소드)
    public static void main(String[] args) {
        new StudentOutput().run(); // StudentOutput 객체 실행
    }
}
