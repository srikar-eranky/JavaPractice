import java.util.HashMap;
public class RomanToInt {

    static HashMap<Character,Integer> map;

    // set up hashmap of roman numerals
    static void setUp(){
        map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
    // helper method to find the value
    // of a given key in the hashmap
    static int findVal(char key){
        return map.get(key);
    }

    // converts roman to int
    static int convertToInt(String s){
        setUp();
        
        int sum = 0;
        // convert str to char array
        char[] chArr = s.toCharArray();
        for(int i = 0; i < chArr.length; i++){
            if(i != chArr.length-1 && findVal(chArr[i]) < findVal(chArr[i+1])){
                // if not on the last character and the character value is less than
                // the next character value, then check if the next char is equal to
                // 5 times the current char or 10 times the current char
                if(findVal(chArr[i])*5 == findVal(chArr[i+1]) || findVal(chArr[i])*10 == findVal(chArr[i+1])){  
                    // if satisfied, subtract the roman numerals  
                    sum += (findVal(chArr[i+1]) - findVal(chArr[i]));
                    i++;
                } else {
                    // invalid numeral
                    return -1;
                }
            } else {
                // otherwise, add numeral directly to sum
                sum += findVal(chArr[i]);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(convertToInt("III")); // 3
        System.out.println(convertToInt("LVIII")); // 58
        System.out.println(convertToInt("MCMXCIV")); // 1994
    }
}
