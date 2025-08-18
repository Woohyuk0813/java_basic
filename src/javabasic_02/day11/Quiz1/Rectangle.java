package javabasic_02.day11.Quiz1;

public class Rectangle {
    private int width;
    private int height;
    private String color;
    private int area;

    //생성자들
    public Rectangle() {
    }

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.color = "흰색"; // 기본 색상 설정
    }


    public void calculateArea() {
        this.area = this.width * this.height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Rectangle(String width, String height, String color) {

    }


}
