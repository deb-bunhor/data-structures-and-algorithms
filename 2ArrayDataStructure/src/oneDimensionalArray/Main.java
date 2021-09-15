package oneDimensionalArray;

public class Main {
    public static void main(String[] args){
        SingleDimensionalArray oneDimensionalArray = new SingleDimensionalArray(5);
        oneDimensionalArray.insert(0, 10);
        oneDimensionalArray.insert(1, 20);
        oneDimensionalArray.insert(2, 30);
        oneDimensionalArray.insert(3, 40);
        oneDimensionalArray.insert(4, 50);

        System.out.println(oneDimensionalArray.arr[2]);
    }
}
