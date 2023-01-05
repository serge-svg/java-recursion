package com.svg.java.recursion;

public class RevertAword {

    protected String getWordReversed(String word, int wordLength) {
        if (wordLength == 0) {
            return word.charAt(wordLength)+"";
        } else {
            return word.charAt(wordLength) + getWordReversed(word, wordLength - 1);
        }
    }
    
}
