package javabasic_02.day11.Quiz2;

public class Rectangle {

    private int width;
    private int length;
    private String color;

    public Rectangle() {
    }

    // 매개변수 생성자
    public Rectangle(int width, int length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public int area() {
        return width * length;
    }

    public int perimeter() {
        return 2 * (width + length);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int whidth) {
        this.width = whidth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
