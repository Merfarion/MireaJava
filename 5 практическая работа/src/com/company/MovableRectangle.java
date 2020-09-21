package com.company;
import static java.lang.Math.*;
public class MovableRectangle  implements Movable {

    private MovablePoint p1;
    private MovablePoint p2;
    Rectangle r = new Rectangle();
    private double w,l;
    public MovableRectangle(int x1, int y1,int x2,int y2){
        this.p1 = new MovablePoint(x1,y1);
        this.p2 = new MovablePoint(x2,y2);

        r.setWidth(abs(abs(x1)-abs(x2)));
        r.setLength(abs(abs(y1)-abs(y2)));
        w= r.getWidth();
        l= r.getLength();
    }
    public MovablePoint getP1() {
        return p1;
    }

    public void setWidth(double width) {
        System.out.println(width);
        r.setWidth(width);
        if(width!=0) {
            p1.setX(p1.getX() + ((abs(w - width)) / 2));
            p2.setX(p2.getX() - ((abs(w - width)) / 2));
        }
        w=width;
    }

    public  double getWidth (){
        return r.getWidth();
    }

    public void setLength (double length){
        r.setLength(length);
        System.out.println(l);
        System.out.println(length);
        if(length!=0) {
            p1.setY(p1.getY() + ((abs(l - length)) / 2));
            p2.setY(p2.getY() - ((abs(l - length)) / 2));
        }
        l=length;
    }

    public  double getLength (){
        return r.getLength();
    }
    public void setP1(int x,int y) {
        this.p1 = new MovablePoint(x,y);
        r.setWidth(abs(abs(p1.getX())-abs(p2.getX()))) ;
        r.setLength(abs(abs(p1.getY())-abs(p2.getY())));
        w=r.getWidth();
        l=r.getLength();
    }

    public MovablePoint getP2() {
        return p2;
    }

    public void setP2(int x,int y) {
        this.p2 = new MovablePoint(x,y);
        r.setWidth(abs(abs(p1.getX())-abs(p2.getX()))) ;
        r.setLength(abs(abs(p1.getY())-abs(p2.getY())));
        l=r.getLength();
        w=r.getWidth();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", r=" + r +

                '}';
    }

    @Override

    public void Move(int right, int down) {
        p1.Move(right, down);
        p2.Move(right, down);
    }
}
