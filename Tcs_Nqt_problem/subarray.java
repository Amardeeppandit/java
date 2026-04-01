package Tcs_Nqt_problem;

import java.util.Arrays;
import java.util.Scanner;

public class subarray {
    public static void main(String[] args){
        System.out.println("Enter the length of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        subarray an = new subarray();
        System.out.println(Arrays.toString(an.Subarray(arr)));
    }
    public int[] Subarray(int[] arr){
        int sum = 0;
        int[] subarray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            subarray[i] = sum + arr[i];
            sum = subarray[i];
        }
        return subarray;
    }
}
