package Board;

import lombok.Data;
import java.util.Date;

@Data
public class Board {
    private int bno;        // 글 번호
    private String bTitle;  // 글 제목
    private String bContent; // 글 내용
    private String bWriter; // 글쓴이
    private Date bDate;     // 작성 날짜

    public Board() {
    }

    public Board(int bno, String bWriter, Date bDate, String bTitle, String bContent) {
        this.bno = bno;
        this.bTitle = bTitle;
        this.bContent = bContent;
        this.bWriter = bWriter;
        this.bDate = bDate;
    }
}