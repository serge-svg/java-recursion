package com.svg.java.recursion;

public class RevertAnumber {

    private int n = 0;
    protected int getNumberReversed(int number) {        
        if (number == 0) return n;
        else {
            int digit = number % 10;
            n = n * 10 + digit;
            getNumberReversed(number / 10);
        }
        return n;
    }
}
