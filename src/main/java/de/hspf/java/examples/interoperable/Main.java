package de.hspf.java.examples.interoperable;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {

        de.hspf.kotlin.examples.interoperable.MainKt.main(new String[0]);

    }

    public void sleep() throws InterruptedException {
        Thread.sleep(1000);
    }

}
