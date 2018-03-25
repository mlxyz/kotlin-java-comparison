package de.hspf.java.examples.extension;

import java.math.BigInteger;
import java.util.Random;

public class MyBigInteger extends BigInteger {
    public MyBigInteger(byte[] bytes) {
        super(bytes);
    }

    public MyBigInteger(int i, byte[] bytes) {
        super(i, bytes);
    }

    public MyBigInteger(String s, int i) {
        super(s, i);
    }

    public MyBigInteger(String s) {
        super(s);
    }

    public MyBigInteger(int i, Random random) {
        super(i, random);
    }

    public MyBigInteger(int i, int i1, Random random) {
        super(i, i1, random);
    }

    /**
     * Returns the number of digits of the current number
     * This methods logic was taken from https://stackoverflow.com/a/23773083
     * @return The number of digits in this BigInteger
     */
    public int getDigits() {
        double factor = Math.log(2) / Math.log(10);
        int digitCount = (int) (factor * this.bitLength() + 1);
        if (BigInteger.TEN.pow(digitCount - 1).compareTo(this) > 0) {
            return digitCount - 1;
        }
        return digitCount;
    }

}
