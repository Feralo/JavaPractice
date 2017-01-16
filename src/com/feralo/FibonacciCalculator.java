package com.feralo;

import java.util.Scanner;


public class FibonacciCalculator {

    public static void main(String args[]) {

        // Input to print Fibonacci series
        System.out.println("Enter the number of Fibonacci numbers to print");
        int number = new Scanner(System.in).nextInt();

        System.out.println("First " + number +" members of the Fibonaci series:");
        // Print the series
        for(int i=1; i<=number; i++)
            System.out.print(fibonacci(i)+ " ");
    }

    public static int fibonacci2(int number){
        // handle the 'base case'
        if(number == 1 || number == 2){
            return 1;
        }

        // build up the string to do all the work
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i = 3; i <= number; i++){
           fibonacci = fibo1 + fibo2;
           fibo1 = fibo2;
           fibo2 = fibonacci;
        }
        return fibonacci;
    }

    public static int fibonacci(int number){
        if(number == 1 || number ==2){
            return 1;
        }

        return fibonacci(number -1) + fibonacci(number - 2);
    }
}
