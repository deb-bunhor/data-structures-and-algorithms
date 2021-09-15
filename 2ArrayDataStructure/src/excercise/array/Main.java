package excercise.array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("How many days temperature?");

        int numDay = console.nextInt();
        int sum = 0;
        for(int i=1; i<=numDay; i++){
            System.out.print("Day "+ i +"'s high temp: ");
            int next = console.nextInt();
            sum += next;
        }

        double average = sum / numDay;
        System.out.println();
        System.out.println("Average temp = "+average);
    }
}
