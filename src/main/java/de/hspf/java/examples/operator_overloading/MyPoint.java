package de.hspf.java.examples.operator_overloading;


import java.awt.*;

public class MyPoint extends Point {

    public MyPoint() {
    }

    public MyPoint(Point point) {
        super(point);
    }

    public MyPoint(int i, int i1) {
        super(i, i1);
    }

    public Point plus(Point point) {

        return new Point(this.x + point.x, this.y + point.y);
    }

}
