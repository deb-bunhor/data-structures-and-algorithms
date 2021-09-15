package excercise.array;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args){
        Functions functions = new Functions();

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        functions.rotateMatrix(matrix);

        System.out.println(Arrays.deepToString(matrix));

    }
}
