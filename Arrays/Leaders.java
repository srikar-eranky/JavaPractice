import java.util.ArrayList;
public class Leaders {
    /*
     * Given an array of positive integers.
Your task is to find the leaders in the array.
Note: An element of array is leader if it is greater than or equal to all the elements to its right side.
Also, the rightmost element is always a leader.
     */
    static boolean inArray(ArrayList<Integer> arr, int n){
        for(int i : arr){
            if(i == n){
                return true;
            }
        }
        return false;
    }
    static ArrayList<Integer> findLeaders(int[] arr){
        ArrayList<Integer> resultArr = new ArrayList<>();
        for(int i = 0; i < arr.length-1; i++){
            boolean isLeader = true;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] < arr[j] || inArray(resultArr, arr[i])){
                    isLeader = false;
                }
            }

            if(isLeader){
                resultArr.add(arr[i]);
            }
        }

        if(!inArray(resultArr, arr[arr.length-1])){
                resultArr.add(arr[arr.length-1]);
        }
        
        return resultArr;
    }

    public static void main(String[] args){
        // test 1 - sorted in ascending order:
        System.out.println(findLeaders(new int[]{1,2,3,4,5})); // [5]
        //test 2 - sorted in descending order:
        System.out.println(findLeaders(new int[]{5,4,3,2,1})); // [5,4,3,2,1]
        //test 3 - duplicates in array:
        System.out.println(findLeaders(new int[]{6,2,6,3,4})); //[6,4]
        //test 4 - 2 leaders:
        System.out.println(findLeaders(new int[]{6,2,1,4,3})); // [6,4,3]
        //test 5 - all numbers are same element:
        System.out.println(findLeaders(new int[]{3,3,3,3,3})); // [3]

    }
}
