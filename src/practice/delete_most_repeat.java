package practice;

import java.util.*;
public class delete_most_repeat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int count_repeat = 0;
        int[] repeat_arr = {0};
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            if(count > count_repeat){
                count_repeat = count;
                repeat_arr[0] = arr[i];
            }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != repeat_arr[0]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
