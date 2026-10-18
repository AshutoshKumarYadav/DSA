package JPMorgan.TwoPointer;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args){
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int n= removeDuplicates(arr);
        System.out.println("Array after removing duplicates: "+ Arrays.toString(Arrays.copyOf(arr,n)));

        System.out.println("Length of array after removing duplicates: "+ removeDuplicates(new int[]{1, 1, 2, 2, 3, 4, 4, 5}));
    }
    public static int removeDuplicates(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int j=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }

        }
        return j+1;
    }
}
