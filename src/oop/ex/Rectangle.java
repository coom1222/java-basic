package oop.ex;

public class Rectangle {
    int width;
    int height;

    // 넓이
    int calculateArea() {
        return width * height;
    }
    //둘레길이
    int calculatePerimeter() {
        return 2 * (width + height);
    }
    // 정사각형여부
    boolean isSquare() {
        return width == height;
    }
}
