package practice;

public class anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
//        anagram an = new anagram();
//        System.out.println(an.isAnagram(str1,str2)); if static is not define
        System.out.println(isAnagram(str1,str2)); // if static is used
    }
    public static boolean isAnagram(String str1 , String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        int[] count = new int[256];
        for(char ch : str1.toCharArray()){
            count[ch]++;
        }
        for(char ch : str2.toCharArray()){
            count[ch]--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
}
