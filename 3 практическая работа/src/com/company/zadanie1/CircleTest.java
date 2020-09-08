package com.company.zadanie1;

public class CircleTest {
    public static void main(String[] args){
Circle circle = new Circle(24.5);
System.out.println("Радиус окружности равен: " + circle.getRadius());
circle.setRadius(28.5);
        System.out.println("Радиус окружности равен: " + circle.getRadius());
    }
}
