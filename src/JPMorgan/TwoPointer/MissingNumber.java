package JPMorgan.TwoPointer;

public class MissingNumber {


    public static int missingNumber(int[] nums){
        int n= nums.length;
        int expectedSum = n*(n+1)/2;
        int actualSum =0;
        for(int num : nums){
            actualSum +=num;
        }
        return expectedSum-actualSum;
    }
    void main(){
        int[] nums = {3,0,1};
        //System.out.println(missingNumber(nums));

        System.out.println(missingNumberXOR(nums));
    }

    //By XOR

    public static int missingNumberXOR(int[] nums){
        int xor = nums.length;
        for(int i=0;i<nums.length;i++){
            xor = xor^i^nums[i];

        }
        return xor;
    }

}
