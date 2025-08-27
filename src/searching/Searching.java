package searching;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num = in.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the elements in array");
        for(int i= 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target element");
        int tar = in.nextInt();
        int ans = linearsearch(arr,tar);
        System.out.println("The Target value index "+ans);
    }

    static int linearsearch(int[] arr, int tar) {
        for (int i=0 ; i<arr.length ; i++){
            if(tar == arr[i]){
                return i;
            }
        }
    return -1;}
}
// only work if the elements are unique in array