package javabasic_02.day11.TEST01;

public class TestMovie {
 
	public static void main(String[] args) { 
		Movie myMovie = new Movie();
		myMovie.setTitle("어거스트 러쉬"); //영화명
		myMovie.setGenre("Drama"); // 장르
		myMovie.play(); // 영화의 정보
		
		System.out.println("--------------------");

		Movie yourMovie = new Movie();
		yourMovie.setTitle("나는 전설이다");
		yourMovie.setGenre("SF");
		yourMovie.play();
	}



}
