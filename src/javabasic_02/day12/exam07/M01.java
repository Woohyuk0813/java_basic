package javabasic_02.day12.exam07;

import javabasic_02.day11.AA.C;

public class M01 {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[4];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle();
        rectangles[3] = new Rectangle();

        Triangle[] triangles = new Triangle[5];
        triangles[0] = new Triangle();
        triangles[1] = new Triangle();
        triangles[2] = new Triangle();
        triangles[3] = new Triangle();
        triangles[4] = new Triangle();


        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle();
        circles[2] = new Circle();

        Shape[] shapes = new Shape[4];
        shapes[0] = rectangles[0];
        shapes[1] = rectangles[1];
        shapes[2] = rectangles[2];
        shapes[3] = rectangles[3];

        Circle circle = (Circle) shapes[3]; // 다운캐스팅

    }
}
