package excercise.array;

public class Permutation {
    public static void main(String[] args){
        Functions functions = new Functions();
        int[] intArrayOne = {1,2,3,4,5};
        int[] intArrayTwo = {5,4,3,2,1,0};

        System.out.println(functions.permutation(intArrayOne, intArrayTwo));
    }
}
