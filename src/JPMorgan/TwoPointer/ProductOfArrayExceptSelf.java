package JPMorgan.TwoPointer;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4};
        System.out.println("Product Of array :"+ Arrays.toString(productExceptSelf(nums)));
    }



    public static int[] productExceptSelf(int[] nums){
        int n= nums.length;
        int[] result = new int[n];
        //Step1: Store prefix product
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i] = result[i-1]*nums[i-1];
        }

        //step 2: Multiply by suffix product

        int suffix = 1;
        for(int i=n-1;i>=0;i--){
            result[i] = result[i]*suffix;
            suffix = suffix*nums[i];
        }
        return result;
    }
}
