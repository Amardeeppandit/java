package practice;
import java.util.*;

public class max_subarray {
    public static void main(String[] args) {
        int[] arr = {2,3,-3,4,5,-6,-7};
        int max = arr[0];
        int min = arr[0];
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(arr[i] , arr[i]*max);
            min = Math.min(arr[i] , arr[i]*min);
            ans = Math.max(ans , max);
        }
        System.out.println(ans);
        max_subarray ms = new max_subarray();
        int[] res = ms.maxArr(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
    public int[] maxArr(int[] arr){
        int max = arr[0];
        int min = arr[0];
        int ans = arr[0];
        int start = 0;
        int bestEnd = 0;
        int bestStart = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            if(arr[i] > arr[i]*max){
                max = arr[i];
                start = i;
            }else{
                max = arr[i]*max;
            }
            min = Math.min(arr[i] , arr[i]*min);
            if(max > ans){
                ans = max;
                bestStart = start;
                bestEnd = i+1;
            }
        }return Arrays.copyOfRange(arr, bestStart, bestEnd +1);
    }
}
