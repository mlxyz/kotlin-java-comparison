package de.hspf.java.examples.safe;

public class Main {

    public static void main(String args[]) {
        String output = ((int) Math.round(Math.random()) == 1 ? "This is a string" : null);


        if (output != null) {
            System.out.println("Length: " + output.length());
        } else
            System.out.println("Variable output is null");

        Object obj = ((int) Math.round(Math.random()) == 1 ? new String("This is a string") : new Integer(100));

        if (obj instanceof String) {
            System.out.println("String Length: " + ((String) obj).length());
        }
        if (obj instanceof Integer) {
            System.out.println("Integer +1 : " + ((Integer) obj) + 1);
        }

    }

}
