package com.company;

public class Power {
    public static void main(String[] args) {
        System.out.println(pw(2,2));
    }

    public static int pw(int base, int exp){
        if (exp<0){
            return -1;
        }
        if (exp ==0){
            return 1;
        }
        return base * pw(base, exp-1);
    }

}
