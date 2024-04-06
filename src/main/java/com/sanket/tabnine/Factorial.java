package com.sanket.tabnine;

//class that calculates the factorial of a number
public class Factorial {
    public int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
    //main method
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.calculateFactorial(5));
    }
}