package com.svg.java.recursion;

public class RecursiveSum {
    // Returns the sum of all decreasing values of number
    protected int getSumOfvalues(int number) {
        int result;
        if (number == 1) return 1;
        else {
            result = number + getSumOfvalues(number - 1);
        }
        return result;
    }
}
