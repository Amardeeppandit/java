package Sorted_array;

public class COS_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.print(Find_count(arr));
    }
    static int Find_count(int[] arr){
        int start = 0;
        int end = arr.length -1;
        if(arr[start] < arr[end]){
            return 0;
        }
        while (start<=end){
            int mid = start + (end - start)/2;
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid + 1;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid;
            }
            if(arr[start] < arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return arr.length;
    }
}
