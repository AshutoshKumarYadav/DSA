package JPMorgan;

public class MinimumElement {
    public static void main(String[] args){
        System.out.println("Minimum Element in the array is: " + findMin(new int[]{1, 3, 5, 7, 9}));

    }
    public static int findMin(int arr[]){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is empty");
        }
        int min = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }

        }
        return min;
    }
}
