package excercise.array;

import java.util.Arrays;

public class Pairs {
    public static void main(String [] args) throws IllegalAccessException {
        Functions functions = new Functions();

        int[] intArray = {2,7,13,15};
        int[] result   = functions.twoSum(intArray, 20);
        System.out.println(Arrays.toString(result));
    }
}
