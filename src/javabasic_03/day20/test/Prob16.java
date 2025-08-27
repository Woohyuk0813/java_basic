package javabasic_03.day20.test;

import java.io.*;
import java.util.*;
//문제 : 3명의 학생 (김철수,21,3.5), (이영희,22,3.9) (박민수, 20,3.2) 학생 정보를 students.dat파일에 저장하고 다시 읽어 출력 ex) 반 총점 = 10.6  반 평균 = 3.5 (소수 첫째자리 표현)을 출력하고 학생정보를 나이순으로 콘솔에 출력하세요
//학생정보
// 박민수 , 20세
// 김철수 , 21세
// 이영희 , 22세

public class Prob16 {
    public static void main(String[] args) throws IOException {
        String fileName = "students.dat";

        // 1. 학생 정보 준비
        Student s1 = new Student("김철수", 21, 3.5);
        Student s2 = new Student("이영희", 22, 3.9);
        Student s3 = new Student("박민수", 20, 3.2);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        // 2. 파일에 저장
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));
        for (Student s : students) {
            dos.writeUTF(s.getName());
            dos.writeInt(s.getAge());
            dos.writeDouble(s.getScore());
        }
        dos.close();

        // 3. 파일에서 읽기
        DataInputStream dis = new DataInputStream(new FileInputStream(fileName));
        List<Student> load = new ArrayList<>();
        while (dis.available() > 0) {
            String name = dis.readUTF();
            int age = dis.readInt();
            double score = dis.readDouble();
            load.add(new Student(name, age, score));
        }
        dis.close();

        // 4. 총점 / 평균 계산
        double total = 0;
        for (Student s : load) {
            total += s.getScore();
        }
        double avg = total / load.size();

        System.out.printf("반 총점 = %.1f  반 평균 = %.1f%n", total, avg);

        // 5. 나이순 정렬
        Collections.sort(load);
        for (Student s : load) {
            System.out.println(s.getName() + " , " + s.getAge() + "세");
        }
    }
}
