package Tcs_Nqt_problem;

public class Array_smallest_element {
    public static void main(String[] args){
        int [] arr = {9,4,1,8,7,5};
        Solution.get_element(arr , 5);
    }

}
class Solution{
    public static void get_element(int[] arr , int n){
        int min_value = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            min_value = Integer.min(arr[i] , min_value);
        }
        System.out.println(min_value);
    }
}
