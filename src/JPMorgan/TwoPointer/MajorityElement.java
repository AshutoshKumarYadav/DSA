package JPMorgan.TwoPointer;

public class MajorityElement {
    //Boyer–Moore = Candidate + Count + Cancellation
    //
    //Same number → count++
    //
    //Different number → count--
    //
    //Count zero → नया candidate
    public static int majorityElements(int[] nums){
        int candidate =0;
        int count =0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }

    void main(){
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Elements :"+majorityElements(nums));
    }
}
