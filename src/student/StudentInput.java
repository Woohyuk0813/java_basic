package student;

import java.io.*;
import java.util.*;

public class StudentInput {

    private HashMap<String, Student> studentInfo;
    private final File file = new File("C:/Temp/student.dat");

    public StudentInput() {
        loadCheck();
    }

    // 파일 존재 확인 및 로드
    private void loadCheck() {
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                studentInfo = (HashMap<String, Student>) ois.readObject();
            } catch (Exception e) {
                System.out.println("[오류] 기존 파일 로드 실패, 새로 생성합니다.");
                studentInfo = new HashMap<>();
            }
        } else {
            studentInfo = new HashMap<>();
        }
    }

    private void printUsage() {
        System.out.println("[학생 성적 입력 프로그램]");
        System.out.println("- 종료하려면 이름에 ^^ 입력");
        System.out.println("- 점수는 0~100 사이 정수만 허용");
    }

    private void checkKeyAndInputData() {
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
                try {
                    int score = Integer.parseInt(sc.nextLine());
                    if (score < 0 || score > 100) throw new NumberFormatException();
                    scores.add(score);
                } catch (NumberFormatException e) {
                    System.out.println("[오류] 0~100 사이 숫자만 입력하세요.");
                    valid = false;
                    break;
                }
            }
            if (!valid) continue;

            Student s = new Student(name, scores);
            studentInfo.put(name, s);
            System.out.println("=> 저장됨: " + s);
        }
        sc.close();
    }

    private void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(studentInfo);
            System.out.println("[완료] " + studentInfo.size() + "명의 정보가 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("[오류] 파일 저장 실패");
        }
    }

    public void run() {
        printUsage();
        checkKeyAndInputData();
        saveData();
    }

    public static void main(String[] args) {
        new StudentInput().run();
    }
}
