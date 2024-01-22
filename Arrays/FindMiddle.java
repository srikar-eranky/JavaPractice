public class FindMiddle {
    /*
        * Given an unsorted array of size N.
    Find the first element in array such that all of its left elements are smaller
    and all right elements to it are greater than it.

    Note: Left and right side elements can be equal to required element.
    And extreme elements cannot be required element.
        */
    static int findMiddleElement(int[] arr){
        // initialize result to default value if there is no middle element
        int result = -1;

        for(int i = 1; i < arr.length-1; i++){

            // initialize the two pointers and boolean
            // j checks for elements before the required element
            int j = 0;
            // k checks for elements after the required element
            int k = arr.length-1;
            // boolean tracks whether the element is a middle element or not
            boolean isMiddle = true;

            // iterate the two pointers through array 
            while((j < i || k > i) && isMiddle){
                
                // if one of the pointers does not satisfy the isMiddle condition,
                // set isMiddle to false
                if(arr[j] > arr[i] || arr[k] < arr[i]){
                    isMiddle = false;
                }
                
                // if j or i hasn't reached i, increment/decrement them respectively
                if(j < i){
                    j += 1;
                }
                if(k > i){
                    k -= 1;
                }
                
            }

            if(isMiddle){
                result = arr[i];
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // best case - sorted
        System.out.println(findMiddleElement(new int[]{1,2,3,4,5})); // should return 2
        // normal case
        System.out.println(findMiddleElement(new int[]{2,3,1,4,7,5,9})); // should return 4
        // middle element near the end
        System.out.println(findMiddleElement(new int[]{2,4,3,2,1,7,9})); // should return 7
        // bad case - no middle element descending order
        System.out.println(findMiddleElement(new int[]{6,5,4,3,2,1})); // should return -1
        // worst case - unsorted no middle element
        System.out.println(findMiddleElement(new int[]{2,1,4,3,7,5,9})); // should return -1
        // elements equal to each other
        System.out.println(findMiddleElement(new int[]{1,3,2,4,6,4,7})); // should return 4
    }
}
