package JPMorgan.TwoPointer;

public class FindSecondLargest {

    public static void main(String[] args){
        //6: Find Second Largest
        //out put: Second largest number is: 4
        System.out.println("Second largest number is: "+ findSecondLargest(new int[]{1, 2, 3, 4, 5}));
    }
    public static int findSecondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest= arr[i];
            } else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }

        }
        return secondLargest;

    }
}
