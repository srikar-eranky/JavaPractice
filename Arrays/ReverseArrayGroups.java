/*
 * Given an array arr[] of positive integers of size N.
Reverse every sub-array of K group elements.
 */

 /**
  * ReverseArrayGroups
  */
 public class ReverseArrayGroups {
    /*
     * reverse an array
     */
    static int[] reverseArray(int[] arr){
        // create array to be returned
        int[] result = new int[arr.length];
        // iterate through argument array in reverse order
        for(int i = arr.length-1; i >= 0; i--){
            // place the element at arr[i] at the index specified
            result[arr.length-1-i] = arr[i];
        }
        return result;
    }

    /*
     * reverse all sub arrays of size k
     */
    static void reverseAllSubArrays(int[] arr, int k){
        // if index + k is less than the length of the array (doesn't go out of bounds)
        // reverse that subarray then print the contents
        // iterate through the array by going through each element
        int index = 0;
        while((index + k -1) < arr.length){
            // initializing a new array that can store only the sub-elements
            int[] temp = new int[k];
            for(int i = index; i < index+k; i++){
                temp[i - index] = arr[i];
            }
            int[] reversedSubArray = reverseArray(temp);
            for(int j : reversedSubArray){
                System.out.print(j + " ");
            }
            System.out.println();
            index++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        reverseAllSubArrays(new int[]{1,2,3,4,5,6}, 2);
        reverseAllSubArrays(new int[]{1,2,3,4}, 3);
        reverseAllSubArrays(new int[]{1,2,3,4,5,6}, 3);
        reverseAllSubArrays(new int[]{1,2,3,4}, 7);
    }
 }