package JPMorgan.TwoPointer;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(){
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] result = mergeArrays(arr1, arr2);
        System.out.println("Merged array: " + Arrays.toString(result));
    }
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements from arr1
        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        // Copy remaining elements from arr2
        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;

    }
}
