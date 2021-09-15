package excercise.array;

import java.util.Arrays;

public class Functions {

    public void findMissingNumber(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i: arr) {
            sum1 += i;
        }
        sum2 = 10*(10+1)/2;
        int difference = sum2 - sum1;
        System.out.println("Missing Number is " + difference);

    }

    public int[] twoSum(int[] nums, int target) throws IllegalAccessException {
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j]==target){
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalAccessException("No solution fond");
    }

    public void searchInArray(int[] arr, int valueToSearch){
        for (int i=0; i<arr.length; i++){
            if (valueToSearch == arr[i]){
                System.out.println("The value is founded in index = " + i);
            }
        }
        System.out.println("Value not found");
    }

    public String maxProduct(int[] arr){
        int maxProducts = 0;
        String pairs = "";
        for (int i=0; i<arr.length; i++){
            for (int j=i+i; j<arr.length; j++){
                if(arr[i]*arr[j]>maxProducts){
                    maxProducts = arr[i]*arr[j];
                    pairs = Integer.toString(arr[i]) + "," + Integer.toString(arr[j]);
                }
            }
        }
        return pairs;
    }

    public boolean isUnique(int[] arr){
        boolean unique = true;
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (i == j)
                    continue;
                if (arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
        }
        return unique;
    }

    public boolean permutation(int[] array1, int[] array2){
        if(array1.length != array2.length)
            return false;
        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;

        for (int i=0; i<array1.length; i++){
            sum1 += array1[i];
            sum2 += array2[i];
            mul1 *= array1[i];
            mul2 *= array2[i];
        }

        return sum1 == sum2 && mul1 == mul2;
    }

    public boolean rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i=first; i<last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;

            }

        }
        return true;

    }

//    public int[][] rotateMatrix(int[][] matrix){
//        int[][] temp = new int[matrix.length][matrix.length];
//        for (int i=0; i<matrix.length; i++){
//            for (int j=0; j<matrix.length; j++){
//                temp[i][(matrix.length)-((matrix.length)-j)] = matrix[(matrix.length)-j-1][i];
//            }
//        }
//        return temp;
//    }

    public int[] middle(int[] array){
         return Arrays.copyOfRange(array, 1, array.length-1);
    }

    public int sumDiagonal(int[][] arr){
        
    }
    

}
