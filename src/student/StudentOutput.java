package student;

import java.io.*;
import java.util.*;

public class StudentOutput {
    private static final String FILE_PATH = "C:/Temp/student.dat";
    private HashMap<String, Student> studentInfo = new HashMap<>();
    private List<Student> datas = new ArrayList<>();

    public void loadObjectFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            studentInfo = (HashMap<String, Student>) ois.readObject();
        } catch (Exception e) {
            System.out.println("로드 실패: " + e.getMessage());
        }
    }

    public void rearrangeData() {
        datas.addAll(studentInfo.values());
        datas.sort(Comparator.comparingDouble(Student::getAverage)); // 평균 오름차순
    }

    public void printInfo() {
        System.out.println("[평균 오름차순 성적표]");
        int idx = 1;
        for (Student s : datas) {
            System.out.println(idx + ") " + s);
            idx++;
        }
    }

    public static void main(String[] args) {
        StudentOutput app = new StudentOutput();
        app.loadObjectFromFile();
        app.rearrangeData();
        app.printInfo();
    }
}
