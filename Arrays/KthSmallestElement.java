/*
 * Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array.
note that all array elements are distinct.
 */
import java.util.Arrays;
public class KthSmallestElement {

    public static int findSmallest(int[] arr, int k){
        
        if(k > 0){
            // sort the array
            Arrays.sort(arr);
            // return the element at the k-1 index
            return arr[k-1];
        } else {
            return -1;
        }
        
    }
    public static void main(String[] args) {
        // working test case
        System.out.println(findSmallest(new int[]{1,4,3,2}, 3)); // 3
        // working case
        System.out.println(findSmallest(new int[]{6,3,9,5}, 2)); // 5
        // k = 0
        System.out.println(findSmallest(new int[]{6,3,9,5}, 0)); // -1
    }
}
