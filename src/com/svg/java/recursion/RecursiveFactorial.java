package com.svg.java.recursion;
public class RecursiveFactorial {

    protected int getFactorial(int number) {
        int result;
        if (number == 1) return 1;
        else {
            result = number * getFactorial(number - 1);
        }

        return result;
    }
}
