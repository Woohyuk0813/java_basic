package student;  // student 패키지에 속한 클래스

import java.io.*;   // 파일 입출력(ObjectInputStream, ObjectOutputStream 등)
import java.util.*; // HashMap, ArrayList, Scanner 등 사용

// 학생 성적을 입력받아 파일에 저장하는 프로그램
public class StudentInput {

    // key: 학생 이름, value: Student 객체
    private HashMap<String, Student> studentInfo;

    // 학생 정보를 저장할 파일 객체
    private final File file = new File("C:/Temp/student.dat");

    // 생성자 (객체가 생성될 때 자동으로 실행됨)
    public StudentInput() {
        initData(); // 파일이 있으면 불러오고, 없으면 새로 만듦
    }

    // 1. 기존 파일(student.dat) 불러오기 (있으면)
    private void initData() {
        if (file.exists()) { // 파일이 존재하는지 확인
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                // 파일에 저장된 HashMap<String, Student> 읽어오기
                studentInfo = (HashMap<String, Student>) ois.readObject();
            } catch (Exception e) {
                // 읽기 실패하면 새로 만듦
                System.out.println("기존 파일 로드 실패, 새로 생성합니다.");
                studentInfo = new HashMap<>();
            }
        } else {
            // 파일이 아예 없으면 빈 HashMap 생성
            studentInfo = new HashMap<>();
        }
    }

    // 2. 프로그램 사용 방법 안내 출력
    private void printGuide() {
        System.out.println("[학생 성적 입력 프로그램]");
        System.out.println("- 종료하려면 이름에 ^^ 입력");
        System.out.println("- 점수는 0~100 사이 정수만 허용");
    }

    // 3. 학생 정보 입력받기
    private void inputStudentData() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("이름: ");
            String name = sc.nextLine();

            // 이름이 ^^ 이면 입력 종료
            if (name.equals("^^")) break;

            // 같은 이름이 이미 있으면 중복 처리
            if (studentInfo.containsKey(name)) {
                System.out.println("이미 존재하는 이름입니다.");
                continue;
            }

            // 과목별 점수 입력
            List<Integer> scores = new ArrayList<>();
            String[] subjects = {"국어", "영어", "수학", "과학"}; // 과목 목록
            boolean valid = true; // 점수가 정상적으로 입력되었는지 체크

            for (String sub : subjects) {
                System.out.print(sub + ": ");
                try {
                    int score = Integer.parseInt(sc.nextLine()); // 정수 입력 받기
                    if (score < 0 || score > 100) throw new NumberFormatException(); // 범위 체크
                    scores.add(score); // 점수를 리스트에 추가
                } catch (NumberFormatException e) {
                    // 숫자가 아니거나 범위를 벗어나면 에러 처리
                    System.out.println("0~100 사이 숫자만 입력하세요.");
                    valid = false;
                    break; // 잘못 입력되면 과목 루프 중단
                }
            }

            // 입력 도중 오류가 나면 다시 처음부터 입력
            if (!valid) continue;

            // Student 객체 생성 (이름, 점수 리스트 전달)
            Student s = new Student(name, scores);

            // HashMap에 학생 저장 (key = 이름)
            studentInfo.put(name, s);

            System.out.println("저장: " + s); // 저장 확인 메시지
        }
        sc.close(); // 입력 다 끝나면 Scanner 닫기
    }

    // 4. 입력받은 데이터를 파일에 저장
    private void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(studentInfo); // HashMap 자체를 파일에 저장
            System.out.println("[완료] " + studentInfo.size() + " 정보가 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("[오류] 파일 저장 실패");
        }
    }

    // 전체 실행 흐름
    public void run() {
        printGuide();      // 안내 메시지 출력
        inputStudentData();// 학생 입력받기
        saveData();        // 파일 저장
    }

    // 프로그램 시작점 (main 메소드)
    public static void main(String[] args) {
        new StudentInput().run(); // StudentInput 객체 실행
    }
}
