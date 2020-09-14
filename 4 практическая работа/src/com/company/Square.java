package com.company;

public class Square extends Shape{
    private double side;
public Square (){}
public Square (double side){
this.side = side;
}
    public Square (double side,String color,boolean filled){

        this.side = side;

        this.color = color;
        this.filled = filled;
    }
public double getSide(){
    return side;
}
public void setSide (double side){
    this.side = side;
}
    public double getArea(){
    double s=side*side;
return s;
    }
    public double getPerimeter(){
    double p= 4*side;
    return p;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
