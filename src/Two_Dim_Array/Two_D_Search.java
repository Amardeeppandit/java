package Two_Dim_Array;

import java.util.Arrays;

public class Two_D_Search {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 9;
        System.out.print(Arrays.toString(Search(arr,target)));
    }
    static int[] Search(int[][] arr , int target){
        int r = 0;
        int c = arr.length -1;
        while(r < arr.length && c>=0){
            if(arr[r][c] == target){
                return new int[]{r,c};
            }
            if(arr[r][c] < target){
                r++;
            }else{
                c--;
            }
        } return new int[]{
                -1,-1
        };
    }
}
