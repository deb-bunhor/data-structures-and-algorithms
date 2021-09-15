package com.company;

public class Fibonacci {
    //Recursive case - flow
    // n! = (n-1)*(n-2)*....*2*1 --> n! = n*(n-1)!


    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }

    public static int fibonacci(int n){
        if(n<0){
            return -1;
        }
        if (n==0 || n==1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
