package Arrays_init;

import java.util.Arrays;
import java.util.Scanner;

public class swaparray {
    public static void main(String[] args) {
        int[] arr1 = {3,4,2,3,5};
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt();
        }
        for(int i= arr.length -1 ; i >= 0 ; i=i-1 ){
            System.out.print(arr[ i ] + arr1[ i ] + " ");
        }
        System.out.println(Arrays.toString(arr));
    }
}
