package com.company;

public class Circle extends Shape{
    protected double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle (double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double s=3.14*radius*radius;
return s;
    }
    public double getPerimeter(){
        double p=2*3.14*radius;
       return  p;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
