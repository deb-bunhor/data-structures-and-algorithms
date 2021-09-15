package com.company;

public class LogicBehindRecursion {

//    static void firstMethod(){
//        secondMethod();
//        System.out.println("Method First");
//    }
//    static void secondMethod(){
//        thirdMethod();
//        System.out.println("Method Second");
//    }
//    static void thirdMethod(){
//        fourMethod();
//        System.out.println("Method Third");
//    }
//    static void fourMethod(){
//        System.out.println("Method Four");
//    }


    static void recursiveMethod(int n){
        if(n<1){
            System.out.println("n is less than 1");
        }else{
            recursiveMethod(n-1);
            System.out.println(n);
        }

    }



    public static void main(String[] args) {
//        firstMethod();
//        System.out.println("1");
        recursiveMethod(1000);
    }
}
