package JPMorgan.TwoPointer;

import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {
        //4: Rotate Array Left
        //out put: Rotated array is: [3, 4, 5, 1, 2]
        System.out.println("Rotated array is: "+ Arrays.toString(rotateArrayLeft(new int[]{1, 2, 3, 4, 5}, 2)));
    }

    public static int[] rotateArrayLeft(int[] arr, int k){
        int arrayLength = arr.length;
        k=k%arrayLength;
        reverse(arr,0,k-1);
        reverse(arr,k,arrayLength-1);
        reverse(arr,0,arrayLength-1);
        return arr;
    }

    public static void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

    }

}
