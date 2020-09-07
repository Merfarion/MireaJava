package com.company;

public class Shape {
   private String name;
    private int length;
    private double weight;
    private int height;

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
