package com.svg.java.recursion;

public class PrintRevertedNumber {

    protected void getNumberReversed(int number) {        
        if (number <  10) {
            System.out.print(number+"\n");
            return;
        } else {
            System.out.print(number % 10);
            getNumberReversed(number/10);
        }
    }
}
