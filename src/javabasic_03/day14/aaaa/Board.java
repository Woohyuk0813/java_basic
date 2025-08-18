package javabasic_03.day14.aaaa;

public class Board {
    private String subject;
    private String content;
    private String writer;

    public Board(String subject, String content, String writer){
        this.content = content;
        this.subject = subject;
        this.writer = writer;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
