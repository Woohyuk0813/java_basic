package student;  // student 패키지에 속한 클래스

import java.io.*;   // 파일 입출력에 필요한 클래스들(ObjectInputStream, ObjectOutputStream 등)
import java.util.*; // HashMap, TreeSet, Comparator 같은 자료구조 사용을 위해 import

// 학생 정보를 정렬하고 저장하는 클래스
public class SortedStudent {

    // key: 학번(혹은 id), value: Student 객체
    private HashMap<String, Student> studentInfo;

    // Student 객체들을 정렬해서 담을 TreeSet
    private TreeSet<Student> sortedSet;

    // 1. 기존에 저장된 student.dat 파일에서 학생 데이터를 불러오기
    private void loadObjectFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Temp/student.dat"))) {
            // student.dat 파일에 저장된 HashMap<String, Student> 데이터를 읽어옴
            studentInfo = (HashMap<String, Student>) ois.readObject();
        } catch (Exception e) {
            // 파일이 없거나 읽는 도중 에러가 발생하면 실행됨
            System.out.println("파일 로드 실패");
            studentInfo = new HashMap<>(); // 비어 있는 HashMap으로 초기화
        }
    }

    // 2. TreeSet을 만들어 평균 기준으로 정렬되도록 설정
    private void createTreeSet() {
        // Comparator로 정렬 기준을 정의
        // (1) Student 평균 점수(getAverage) 기준으로 오름차순 정렬
        // (2) 평균이 같으면 이름(getName)으로 오름차순 정렬
        sortedSet = new TreeSet<>(Comparator
                .comparingDouble(Student::getAverage)
                .thenComparing(Student::getName));

        // HashMap에 있는 Student 객체들을 TreeSet에 모두 추가 → 자동 정렬됨
        sortedSet.addAll(studentInfo.values());
    }

    // 3. 정렬된 결과를 콘솔에 출력
    private void printResult() {
        System.out.println("[정렬 및 저장: 평균 오름차순]");
        int idx = 1; // 출력 순번
        for (Student s : sortedSet) {
            if (idx > 10) break; // 상위 10명까지만 출력
            System.out.printf("%d) %s (평균 %.1f)\n", idx++, s.getName(), s.getAverage());
        }
    }

    // 4. 정렬된 결과(TreeSet)를 새로운 파일에 저장
    private void outputObject() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Temp/orderByAvg.dat"))) {
            // sortedSet 객체 자체를 파일로 저장
            oos.writeObject(sortedSet);
            System.out.println("정렬된 결과를 파일로 저장했습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장 실패");
        }
    }

    // 전체 실행 흐름
    public void run() {
        loadObjectFromFile(); // 1. 기존 데이터 불러오기
        createTreeSet();      // 2. 정렬 기준대로 TreeSet 만들기
        printResult();        // 3. 결과 콘솔에 출력
        outputObject();       // 4. 결과 파일로 저장
    }

    // 프로그램 시작점 (main 메소드)
    public static void main(String[] args) {
        new SortedStudent().run(); // SortedStudent 객체 생성 후 run() 실행
    }
}