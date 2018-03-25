package de.hspf.java.examples.extension;

import java.util.Random;

public class Main {

    public static void main(String args[]) {

        MyBigInteger bigInteger = new MyBigInteger(1024, new Random());

        System.out.println("The number " + bigInteger.toString() + " has " + bigInteger.getDigits() + " digits.");

    }
}
