package de.hspf.java.examples.optional_parameters;

public class Main {
    public static void main(String args[]) {

        printString("Hallo Welt!");

        printString("Hallo Welt!", true);
    }

    private static void printString(String stringToPrint, boolean shouldShout) {
        System.out.println(shouldShout ? stringToPrint.toUpperCase() : stringToPrint);
    }

    private static void printString(String stringToPrint) {
        printString(stringToPrint, false);
    }
}

