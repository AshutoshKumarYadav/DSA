package JPMorgan;

public class MaximumElement {

    public static void main(String[] args){
        System.out.println("Maximum Element in the array is: " + findMax(new int[]{1, 3, 5, 7, 9}));
    }
    public static int findMax(int[] arr){
        if(arr == null ||arr.length ==0){
            throw new IllegalArgumentException("Array is empty");
        }
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];;
            }
        }
        return max;
    }
}


