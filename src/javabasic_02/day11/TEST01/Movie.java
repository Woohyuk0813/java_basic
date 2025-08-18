package javabasic_02.day11.TEST01;

public class Movie {
    //title 영화명
    //genre 장르

    private String title;
    private String genre;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void play() {
        System.out.println(this.title + "(" + this.genre + ")" + " 상영중입니다.");
    }
}

