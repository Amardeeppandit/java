package practice;

import java.util.*;

public class string_repeat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter the String"));
        String str = sc.nextLine();
        int count_repeat = 0;
        char repeat_char = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count>count_repeat){
                count_repeat = count;
                repeat_char = str.charAt(i);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if(repeat_char != str.charAt(i)){
                System.out.print(str.charAt(i));
            }
        }
    }
}
