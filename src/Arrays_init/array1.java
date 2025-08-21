package Arrays_init;

import java.util.Scanner;

public class array1 {

    public static void main(String[] args) {
        int[] arr = new int[6];
        System.out.print("Enter the number for array");
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < arr.length ; i++ ){
            arr[i] = input.nextInt();
        }
       for (int num : arr ){
           System.out.print(num + " ");
       }
    }
}
