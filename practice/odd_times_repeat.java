package practice;

import java.util.HashMap;
import java.util.Map;

public class odd_times_repeat {
    public static void main(String [] args){
        char[] arr = {'a','b','c','a','b'};
        char x = odd_repeated(arr);
        System.out.println(x);
    }
    public static char odd_repeated(char[] arr){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char i : arr){
            if(map.containsKey(i)){
                map.put(i , map.get(i)+1);
            }else{
                map.put(i , 1);
            }
        }
        for(Map.Entry<Character , Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 != 0){   // odd count
                return entry.getKey();
            }
        }
        return '\0';
    }
}
