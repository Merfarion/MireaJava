package com.company;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle () {

    }
    public Rectangle(double width,double length){
        this.width =width;
        this.length = length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color, filled);
        this.width =width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        double s =width*length;
        return  s;
    }
    public double getPerimeter(){
        double p =2*width + (2*length);
        return p;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
