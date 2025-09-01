package student;

import java.io.*;
import java.util.*;

public class SortedStudent {

    private HashMap<String, Student> studentInfo;
    private TreeSet<Student> sortedSet;

    private void loadObjectFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Temp/student.dat"))) {
            studentInfo = (HashMap<String, Student>) ois.readObject();
        } catch (Exception e) {
            System.out.println("파일 로드 실패");
            studentInfo = new HashMap<>();
        }
    }

    private void createTreeSet() {
        sortedSet = new TreeSet<>(Comparator
                .comparingDouble(Student::getAverage)
                .thenComparing(Student::getName)); // 평균 ASC, 평균 같으면 이름 ASC
        sortedSet.addAll(studentInfo.values());
    }

    private void printResult() {
        System.out.println("[정렬 및 저장: 평균 오름차순]");
        int idx = 1;
        for (Student s : sortedSet) {
            if (idx > 10) break;
            System.out.printf("%d) %s (평균 %.1f)\n", idx++, s.getName(), s.getAverage());
        }
    }

    private void outputObject() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Temp/orderByAvg.dat"))) {
            oos.writeObject(sortedSet);
            System.out.println("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   정렬된 결과를 파일로 저장했습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장 실패");
        }
    }

    public void run() {
        loadObjectFromFile();
        createTreeSet();
        printResult();
        outputObject();
    }

    public static void main(String[] args) {
        new SortedStudent().run();
    }
}
