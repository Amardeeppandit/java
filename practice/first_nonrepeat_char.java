package practice;

import java.util.ArrayList;

public class first_nonrepeat_char {
    public static void main(String arges[]){
        String str  = "matchchtam";
        char ch = firstNonRepeatingChar(str);
        System.out.println("First non-repeating character: " + ch);
    }

    private static char firstNonRepeatingChar(String str) {
        int[]freq = freqarr(str);
        for (char c: str.toCharArray()){
            if (freq[c] == 1){
                return c;
            }
        }return '\0';
    }

    public static int[] freqarr(String str){
        int freq[] = new int[256];
        for (char c: str.toCharArray()){
            freq[c]++;
        }
        return freq;
    }
}
