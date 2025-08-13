package javabasic_03.day14;

import java.util.ArrayList;
import java.util.List;

public class BoardListMain {
    public static void main(String[] args) {
        List<Board> boardList = new ArrayList<>();

        //글 하나를 작성하여 게시판에 올립니다.
        boardList.add(new Board("컬렉션 학습 첫째날", "쉽지 않아요...","sym"));

        int size = boardList.size();
        System.out.println("전체 글 수 : " + size);

        for (Board board : boardList) {
            System.out.println("제목 : " + board.getSubject());
            System.out.println("내용 : " + board.getContent());
            System.out.println("작성자 : " + board.getWriter());

        }
    }
}
