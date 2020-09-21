package com.company;

public class MovableCircle extends Circle  implements Movable {
    private MovablePoint center;


    public MovableCircle(int x,int y, double radius) {
        this.radius = radius;
        this.center = new MovablePoint(x,y);

    }


    @Override
    public void Move(int right, int down) {
        center.Move(right, down);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
