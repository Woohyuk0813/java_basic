package student;

import java.io.*;
import java.util.*;

public class StudentInput {
    private static final String FILE_PATH = "C:/Temp/student.dat";
    private HashMap<String, Student> studentInfo = new HashMap<>();

    public void loadCheck() {
        File file = new File(FILE_PATH);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                studentInfo = (HashMap<String, Student>) ois.readObject();
                System.out.println("기존 데이터 로드 완료!");
            } catch (Exception e) {
                System.out.println("기존 데이터 로드 실패: " + e.getMessage());
            }
        }
    }

    public void printUsage() {
        System.out.println("[학생 성적 입력 프로그램]");
        System.out.println("- 종료하려면 이름에 ^^ 입력");
        System.out.println("- 점수는 0~100 사이만 허용됩니다.");
    }

    public void checkKeyAndInputData() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("이름: ");
            String name = sc.nextLine();
            if (name.equals("^^")) break;

            if (studentInfo.containsKey(name)) {
                System.out.println("[오류] 이미 존재하는 이름입니다.");
                continue;
            }

            List<Integer> scores = new ArrayList<>();
            String[] subjects = {"국어", "영어", "수학", "과학"};
            boolean valid = true;

            for (String sub : subjects) {
                System.out.print(sub + ": ");
                int score = sc.nextInt();
                if (score < 0 || score > 100) {
                    System.out.println("[오류] 점수 범위(0~100) 초과");
                    valid = false;
                    break;
                }
                scores.add(score);
            }
            sc.nextLine(); // 버퍼 비우기

            if (!valid) continue;

            Student s = new Student(name, scores);
            studentInfo.put(name, s);
            System.out.println("=> 저장됨: " + s);
        }
        sc.close();
    }

    public void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(studentInfo);
            System.out.println("[완료] " + studentInfo.size() + "명의 정보가 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("저장 실패: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        StudentInput app = new StudentInput();
        app.loadCheck();
        app.printUsage();
        app.checkKeyAndInputData();
        app.saveData();
    }
}
