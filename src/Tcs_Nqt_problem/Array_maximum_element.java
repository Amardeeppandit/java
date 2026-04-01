package Tcs_Nqt_problem;

public class Array_maximum_element {
    public static void main(String[] args){
        int[] arr = {2,3,4,7,5,2,4};
        int n = 6;

//        This is one of the method to create object and then use print from different class
//        Array_maximum_element element = new Array_maximum_element();
//        int x = element.get_element(arr , n);
//        System.out.println(x);
    }
    public int get_element(int []arr , int n){
        int max_value = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_value = Integer.max(max_value, arr[i]);
        }
        return max_value;
    }
}
