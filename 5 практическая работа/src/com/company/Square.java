package com.company;

public class Square extends Rectangle{
    public Square (){}
    public Square (double side){
        this.length = side;
    }
    public Square (double side,String color,boolean filled){

        super.length = side;
        super.width = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return length;
    }
    public void setSide (double side){
        this.length = side;
    }
    public double getArea(){
        double s=length*length;
        return s;
    }
    public double getPerimeter(){
        double p= 4*length;
        return p;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

