package Tcs_Nqt_problem;

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,6};
        get_reverse_array(arr);
    }
    public static void get_reverse_array(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n/2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
