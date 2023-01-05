package com.svg.java.recursion;

public class FindItemPosition {

    protected int getPosition(int[] arrayOfInts, int elementToFind, int position) {
        if (position == arrayOfInts.length) return -1;
        else {
            if (elementToFind == arrayOfInts[position]) return position;
            else {
                return getPosition(arrayOfInts, elementToFind, position + 1);
            }
        } 
    }
    
}
