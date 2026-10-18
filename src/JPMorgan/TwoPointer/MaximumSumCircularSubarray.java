package JPMorgan.TwoPointer;

public class MaximumSumCircularSubarray {

    void main(String[] args){
        int[] arr ={5, -2, 3, 4};
        System.out.println("MaximumSumCircularSubarray: "+maxSubarraySumCircular(arr));
    }
    public static int maxSubarraySumCircular(int[] arr){
    int totalSum =0;
    // for normal max and min subarry;
        int currentMax = 0;
        int maxSum = arr[0];

        int currentMin = 0;
        int minSum = arr[0];

        for(int num : arr){
            // Maximum subarray sum (Kadane's algorithm)
            currentMax = Math.max(num,currentMax+num);
            maxSum = Math.max(maxSum,currentMax);

            // Minimum subarray sum
            currentMin = Math.min(num,currentMin+num);
            minSum = Math.min(minSum,currentMin);

            //sum of the entire array
            totalSum +=num;
        }
        // If all elements are negative,
        // circular sum would incorrectly become zero.
        if(maxSum<0){
            return maxSum;
        }
        // Maximum circular sum = total - minimum subarray
        int circularSum = totalSum-minSum;
        return Math.max(maxSum,circularSum);

    }
}
