package Board;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.TimeZone;

public class BoardExample {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Board> boards = new ArrayList<>();
    static int nextBno = 1;

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        String title = "[게시물 목록]";
        String underbar = "---------------------------------------------";
        String header = "no         writer       date      title        ";
        String menubar = """
            메인 메뉴 : 1.Create | 2. Read | 3. Clear | 4. Exit 
            """;
        boolean flag = true;
        while (flag) {
            System.out.println(title);
            System.out.println(underbar);
            System.out.println(header);
            System.out.println(underbar);
            list();
            System.out.println();
            System.out.println(menubar);
            System.out.print("메뉴 선택> ");
            String input = sc.nextLine();
            switch (input) {
                case "1" -> {
                    System.out.println("*** create() ***");
                    create();
                }
                case "2" -> {
                    System.out.println("*** read() ***");
                    read();
                }
                case "3" -> {
                    System.out.println("*** clear() ***");
                    clear();
                }
                case "4" -> {
                    System.out.println("** 게시판 종료 **");
                    flag = false;
                }
                default -> System.out.println("1부터 4까지의 숫자만 입력하세요");
            }
        }
    }

    public static void list() {
        Date now = new Date();
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
            System.out.println("1    winter     2024.01.02  게시판에 오신 것을 환영합니다.");
            System.out.println("2    winter     2024.01.01  올 겨울은 많이 춥습니다.");
    }

    public static void create() {
        System.out.println("[새 게시물 입력]");
        System.out.print("제목 : ");
        String title = sc.nextLine();
        System.out.print("내용 : ");
        String content = sc.nextLine();
        System.out.print("작성자 : ");
        String writer = sc.nextLine();

        System.out.println("---------------------------");
        System.out.println("보조 메뉴 : 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택 : ");
        String choice = sc.nextLine();

        if (choice.equals("1")) {
            Date date = new Date();
            Board newBoard = new Board(nextBno, writer, date, title, content);
            boards.add(newBoard);
            nextBno++;
            System.out.println("게시물 저장 완료");
        } else if (choice.equals("2")) {
            System.out.println("게시물 만들기 취소");
        }
    }

    public static void read() {
        System.out.print("읽고 싶은 번호 : ");
        int bno = Integer.parseInt(sc.nextLine());

        for (Board b : boards) {
            if (b.getBno() == bno) {
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
                sdf.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
                System.out.println("번호: " + b.getBno());
                System.out.println("작성자: " + b.getBWriter());
                System.out.println("날짜: " + sdf.format(b.getBDate()));
                System.out.println("제목: " + b.getBTitle());
                System.out.println("내용: " + b.getBContent());
                return;
            }
        }
        System.out.println("입력한 번호에 게시물 없음");
    }

    public static void clear() {
        System.out.print("모두 지울까요? (Y/N): ");
        String yesNo = sc.nextLine();
        if (yesNo.equalsIgnoreCase("Y")) {
            boards.clear();
            nextBno = 1;
            System.out.println("모두 지웠어요");
        }
    }
}