package leetcode_assignment;

import java.util.Scanner;

public class Richest_man {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        System.out.println(maximumWealth(arr));
    }
    static int[] sumOfInnerArray(int[][] accounts){
        int[] sums = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                int a = accounts[i][j];
                sum = a + sum;
            }
            sums[i] = sum;
        }
         return sums;
    }
    static int maximumWealth(int[][] accounts){
        int[]amar = sumOfInnerArray(accounts);
        int max = Integer.MIN_VALUE;
        for (int wealth : amar) {
            if (wealth > max) {
                max = wealth;
            }
        }
        return max;
    }
}
