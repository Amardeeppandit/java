package leetcode_assignment;


public class EvenDigit{
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896,3242,4332};
        System.out.println(findNumberofEven(arr));
    }

    static int findNumberofEven(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(is_even(arr[i])){
                count ++;
            }
        }
        return count;
    }
    static boolean is_even(int num){
        return digit(num) % 2 == 0;
    }
    static int digit(int num){
        return (int) (Math.log10(num)) + 1;
    }
}
