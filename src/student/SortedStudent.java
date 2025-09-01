package student;

import java.io.*;
import java.util.*;

public class SortedStudent {
    private static final String INPUT_FILE = "C:/Temp/student.dat";
    private static final String OUTPUT_FILE = "C:/Temp/orderByAvg.dat";

    private HashMap<String, Student> studentInfo = new HashMap<>();
    private TreeSet<Student> sortedSet;

    public void loadObjectFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(INPUT_FILE))) {
            studentInfo = (HashMap<String, Student>) ois.readObject();
            System.out.println("불러온 학생 수: " + studentInfo.size());
        } catch (Exception e) {
            System.out.println("로드 실패: " + e.getMessage());
        }
    }

    public void createTreeSet() {
        sortedSet = new TreeSet<>(Comparator
                .comparingDouble(Student::getAverage)
                .thenComparing(Student::getName));
        sortedSet.addAll(studentInfo.values());
        System.out.println("정렬 완료");
    }

    public void printResult() {
        System.out.println("[정렬 결과 미리보기]");
        sortedSet.stream().limit(10).forEach(s ->
                System.out.println("- " + s.getName() + " (평균 " + s.getAverage() + ")"));
    }

    public void outputObject() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(OUTPUT_FILE))) {
            oos.writeObject(sortedSet);
            System.out.println("[완료] 정렬된 결과를 저장했습니다: " + OUTPUT_FILE);
        } catch (IOException e) {
            System.out.println("저장 실패: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SortedStudent app = new SortedStudent();
        app.loadObjectFromFile();
        app.createTreeSet();
        app.printResult();
        app.outputObject();
    }
}