package com.svg.java.recursion;

public class Main {
   
    
    public static void main(String[] args) throws Exception {        
        /*
        System.out.printf("The factorial of %s is %s%n", 3, new Factorial().getFactorial(3) );
        
        System.out.printf("The total sum of values of %s is %s%n", 4, new Sum().getSumOfvalues(4));
        
        int[] arrayOfInts = {5,2,7,8};        
        System.out.printf("The position of %s inside the array is %s%n", 5, new FindItemPosition().getPosition(arrayOfInts, 7, 0));
        
        int[] matrixRow1 = {1,2,3,4};
        int[] matrixRow2 = {5,6,7,8};
        int[] matrixRow3 = {7,8,0,0,0,0};
        int[][] matrixOfInts = {matrixRow1, matrixRow2, matrixRow3};
        System.out.println("Print the values in the matrix");
        new  MatrixValuesPrinter().printValues(matclearrixOfInts, 0, 0);
        
        String word = "HOLA";
        System.out.println(new RevertAword().getWordReversed(word, word.length()-1));
        */        
        int number = 1234;
        new PrintRevertedNumber().getNumberReversed(number);
        System.out.println(new RevertAnumber().getNumberReversed(number));
        

    }

}
