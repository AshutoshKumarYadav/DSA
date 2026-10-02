package JPMorgan;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args){
        System.out.println("Reversed array is: "+ Arrays.toString(reverseAnArray(new int[]{1, 2, 3, 4, 5})));
    }

    public static int[] reverseAnArray(int[] array){
        int[] arr = array;
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
