package Study.A;

import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();//메서드 호출하여 리스트 가져옴

        for (Board board : list) {
            System.out.println(board.getTitle() + " - " + board.getContent());
        }
    }
}
