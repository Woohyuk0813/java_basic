package Board2;

public class BoardMain {
    public static void main(String[] args) {
        BoardManager boardManager = new BoardManager();
        BoardExample boards = new BoardExample(boardManager);
        boards.run();
    }

}
