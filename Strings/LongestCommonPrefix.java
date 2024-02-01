/*
 * Given a array of N strings,
find the longest common prefix among all strings present in the array.
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] arr){
        // find shortest word
        // check if beginning of each word has the shortest word
        // return if it does
        // if not, take out a letter from shortest word
        // and then repeat the same process
        // return "" if it is not found
        int shortestLength = arr[0].length();
        String shortestWord = arr[0];
        // find the shortest word
        for(int i = 1; i < arr.length; i++){
            if(arr[i].length() < shortestLength){
                shortestWord = arr[i];
                shortestLength = arr[i].length();
            }
        }

        // check if each word starts with the shortest word
        String prefix = "";
        for(int i = shortestWord.length(); i > 0; i--){
            // change the length of the string that is being checked
            String shortWord = shortestWord.substring(0, i);
            boolean isSame = true;
            for(String s : arr){
                // if a word doesn't start with shortest word, break out of the loop
                if(!(s.substring(0, i).equals(shortWord))){
                    isSame = false;
                    break;
                }
            }
            // if all words start with shortWord, set prefix = shortWord
            if(isSame){
                prefix = shortWord;
                return prefix;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flight", "flow"})); // should return fl
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"})); // should return ""
        System.out.println(longestCommonPrefix(new String[]{"flower", "flight", "play"})); // should return ""
    }
}
