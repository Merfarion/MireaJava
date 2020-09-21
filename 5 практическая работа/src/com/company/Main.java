package com.company;

public class Main {
    public static void main(String[] args) {
/*Circle circle = new Circle(12);
System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        Rectangle rectangle = new Rectangle(3,5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        Square square = new Square(5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());*/
        // write your code here
        MovableCircle circle = new MovableCircle(2, 2, 5);
        System.out.println(circle);
        circle.setRadius(6.5);
        circle.Move(5, 2);
        System.out.println(circle);
        MovableRectangle rectangle = new MovableRectangle(3, 1, 4, 5);
        System.out.println(rectangle);
        rectangle.setP1(7, 6);
        System.out.println(rectangle);
        rectangle.Move(-2, 4);
        System.out.println(rectangle);
        rectangle.setWidth(rectangle.getWidth()*2);
        System.out.println(rectangle);
        rectangle.setLength(rectangle.getLength()+4);
        System.out.println(rectangle);
        rectangle.setLength(rectangle.getLength()-5);
        System.out.println(rectangle);
    }
}
