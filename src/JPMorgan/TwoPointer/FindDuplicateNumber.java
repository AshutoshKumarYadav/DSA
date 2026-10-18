package JPMorgan.TwoPointer;

import java.util.HashSet;

public class FindDuplicateNumber {

    void main(){
        int[] nums = {1,3,4,2,2};
        System.out.println("findDublicate :"+findDublicate(nums));
    }


    public static int findDublicate(int[] nums){
        HashSet<Integer> hashSet = new HashSet<>();

        for(int num : nums){
            if(!hashSet.add(num)){
                return num;
            }
        }
        return -1;
    }
}
