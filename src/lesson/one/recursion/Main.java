package com.company;

public class Main {

    static void firstMethod(){
        secondMethod();
        System.out.println("First Method");
    }
    static void secondMethod(){
        thirdMethod();
        System.out.println("First Second");
    }
    static void thirdMethod(){
        fourMethod();
        System.out.println("First Third");
    }
    static void fourMethod(){
        System.out.println("First Four");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}
