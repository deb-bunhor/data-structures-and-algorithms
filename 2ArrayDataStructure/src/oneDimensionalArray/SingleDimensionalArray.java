package oneDimensionalArray;

public class SingleDimensionalArray {
    int arr[] = null;

    public SingleDimensionalArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i=0; i<arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted){
        try{
            if (arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            }else{
                System.out.println("This cell is already occupied");
            }
        }catch (Exception e){
            System.out.println("Invalid Index To Access Array");
        }
    }

    public void traversArray(){
        try {
            for (int i=0; i<arr.length; i++){
                System.out.println(arr[i] + " ");
            }
        }catch (Exception e){
            System.out.println("Array no longer exist!");
        }
    }

    //Search for an element in the given array
    public void searchInArray(int valueToSearch){
        for (int i=0; i<arr.length; i++){
            System.out.println("Value is found at the index of " + i);
            return;
        }
        System.out.println(valueToSearch + "is not found");
    }

    //Delete value from array
    public void deleteValue(int valueToDeleteIndex){
        try{
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value is deleted successfully");
        }catch (Exception e){
            System.out.println("The value provided is invalid");
        }
    }
}
