package student;

import java.io.*;
import java.util.*;

public class StudentOutput {

    private HashMap<String, Student> studentInfo;
    private List<Student> datas;

    private void loadStudentData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Temp/student.dat"))) {
            studentInfo = (HashMap<String, Student>) ois.readObject();
        } catch (Exception e) {
            System.out.println("파일 로드 실패");
            studentInfo = new HashMap<>();
        }
    }

    private void sortStudentData() {
        datas = new ArrayList<>(studentInfo.values());
        datas.sort(Comparator.comparingDouble(Student::getAverage));
    }

    private void printInfo() {
        System.out.println("[평균 오름차순 성적표]");
        int idx = 1;
        for (Student s : datas) {
            System.out.println(idx + ") " + s.getName());
            System.out.println("   점수: " + s.getRecord());
            System.out.printf("   총점: %d, 평균: %.1f, 학점: %s\n",
                    s.getTotal(), s.getAverage(), s.getGrade());
            idx++;
        }
    }

    public void run() {
        loadStudentData();
        sortStudentData();
        printInfo();
    }

    public static void main(String[] args) {
        new StudentOutput().run();
    }
}

