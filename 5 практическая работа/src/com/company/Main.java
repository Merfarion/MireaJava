package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(12);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        Rectangle rectangle = new Rectangle(3,5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        Square square = new Square(5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        // write your code here
    }
}
