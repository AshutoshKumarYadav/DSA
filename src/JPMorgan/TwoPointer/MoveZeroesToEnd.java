package JPMorgan.TwoPointer;

import java.util.Arrays;

public class MoveZeroesToEnd {

    public static void main(String[] args){
        int[] arr= {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println("Array after moving zeroes to end: "+ Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }


        }

    }
}
