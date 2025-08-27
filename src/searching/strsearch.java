package searching;

import java.util.Scanner;

public class strsearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = in.nextLine();
        System.out.println("Enter the target char");
        char tar = in.next().charAt(0);
        boolean ans = IsThere(name ,tar);
        System.out.println(ans);
    }
    static Boolean IsThere(String str , char tar){
        if (str.isEmpty()){
            return false;
        }
        for (int i=0 ; i< str.length() ; i++){
            if(tar == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
