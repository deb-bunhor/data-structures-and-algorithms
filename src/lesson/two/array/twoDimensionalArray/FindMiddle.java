package excercise.array;

import java.util.Arrays;

public class FindMiddle {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};

        Functions functions = new Functions();
        int[] middle = functions.middle(array);

        for (int i=0; i<middle.length; i++){
            System.out.println(middle[i]);
        }
    }
}
