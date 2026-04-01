package Tcs_Nqt_problem;

import java.util.*;
public class Reverse_String {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Reverse_String(str);
    }
    public static void Reverse_String(String str){
        String rev = "";
        for(int i = str.length() - 1 ; i >= 0 ; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println( "Your rev of " + str + " is " + rev );
    }
}
