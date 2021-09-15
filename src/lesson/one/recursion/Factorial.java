package lesson.one.recursion;

public class Factorial {
    //Recursive case - flow
    // n! = (n-1)*(n-2)*....*2*1 --> n! = n*(n-1)!


    public static void main(String[] args) {
        System.out.println(factorial(20));
    }

    public static int factorial(int n){
        if(n<0){
            return -1;
        }
        if (n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
