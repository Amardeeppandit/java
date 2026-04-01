package Tcs_Nqt_problem;

import java.util.Scanner;

public class vowel_consonant {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Is_Vowel_Consonant_Count(str);

    }
    public static void Is_Vowel_Consonant_Count(String str){
        int vowel = 0, consonant = 0;
        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch) != -1){
                    vowel++;
                }else{
                    consonant++;
                }
            }
        }
        System.out.println("vowel : " + vowel + " consonant : " + consonant);
    }
}
