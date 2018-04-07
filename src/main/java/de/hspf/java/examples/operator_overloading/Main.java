package de.hspf.java.examples.operator_overloading;

public class Main {
    public static void main(String args[]) {

        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(3, 5);

        System.out.println(point1.plus(point2));
    }
}
