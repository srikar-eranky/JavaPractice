class RotateArray {

    /*
     * store first element in variable
    shift each element in the array by one position to the left
    place the first element at the end
    do this D times
    assume array has values because it is unsorted
     */

    public static int[] rotateArray(int[] arr, int d){
        int[] resultArr = arr;
        if(d < 0){
            return null;
        } else {
            for(int i = 0; i < d; i++){
                int firstElem = resultArr[0];
                for(int j = 1; j < resultArr.length; j++){
                    resultArr[j-1] = resultArr[j];
                }
                resultArr[resultArr.length-1] = firstElem;
            }
        }
        return resultArr;
    }

    static String toString(int[] arr){
        String result = "";
        for(int i : arr){
            result = result + i + " ";
        }
        return result;
    }
    public static void main(String[] args){
        //test 1 - normal working case:
        int[] result = rotateArray(new int[]{1,2,4,3,5,6}, 3);
        System.out.println(toString(result)); // 3 5 6 1 2 4
        // test 2 - d less than 0:
        System.out.println(rotateArray(new int[]{1,2,3,4,5,6}, -1)); // null
        //test 3 - d equals # of elements:
        System.out.println(toString(rotateArray(new int[]{1,2,4,3,5,6}, 6))); // 1,2,4,3,5,6
        //test 4 - d > # of elements:
        System.out.println(toString(rotateArray(new int[]{1,2,4,3,5,6}, 7))); // 2,4,3,5,6,1
        //test 5 - 2 elements:
        System.out.println(toString(rotateArray(new int[]{5,3}, 1))); // 3,5
    }
}