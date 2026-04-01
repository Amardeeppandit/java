package Tcs_Nqt_problem;

import java.util.Arrays;

public class Second_min_and_max_number {
    public static void main(String[] args){
        int[] arr = {2,3,23,4,65,35};
        int n = 6;
        int[] result = min_max_value(arr , n);
        System.out.println(result[0]+" "+ result[1]);
    }
    public static int[] min_max_value(int[] arr, int n){
        int[] result = new int[2];
        int min_value = Integer.MAX_VALUE , second_min_value = Integer.MAX_VALUE;
        int max_value = Integer.MIN_VALUE , second_max_value = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            min_value = Integer.min(min_value, arr[i]);
            max_value = Integer.max(max_value, arr[i]);
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] < second_min_value && arr[i] != min_value){
                second_min_value = arr[i];
                result[0] = arr[i];
            }
            if(arr[i] > second_max_value && arr[i] != max_value){
                second_max_value = arr[i];
                result[1] = arr[i];
            }
        }
        return result;
    }
}

