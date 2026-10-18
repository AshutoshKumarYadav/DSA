package JPMorgan.TwoPointer;

import java.util.Arrays;

public class RotateArrayRight {

    public static void main(String[] args){

        //5: Rotate Array Right
        //out put: Rotated array is: [4, 5, 1, 2, 3]
        System.out.println("Rotated array is: "+ Arrays.toString(rotateArrayRight(new int[]{1, 2, 3, 4, 5}, 2)));
    }
    public static int[] rotateArrayRight(int[] arr, int k){
        int arrayLength = arr.length;
        k=k%arrayLength;
        // Reverse entire array
        reverse(arr,0,arrayLength-1);
        // Reverse first k elements
        reverse(arr,0,k-1);
        // Reverse remaining elements
        reverse(arr,k,arrayLength-1);
        return arr;

    }
    public static void reverse(int[] arr, int left,int right){
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }

    }
}
