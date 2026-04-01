package practice;

public class max_subarray_of_repeation {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(max_lengthofSubarray(str));
    }

    public static int max_lengthofSubarray(String str) {
        int[] count = new int[256];
        int right = 0;
        int left = 0;
        int max_Len = 0;
        while (right < str.length()) {
            count[str.charAt(right)]++;
            if (count[str.charAt(right)] > 1) {
                count[str.charAt(left)]--;
                left++;
            }
            max_Len = Math.max(max_Len , right-left+1);
            right++;
        }
        return max_Len;
    }
}