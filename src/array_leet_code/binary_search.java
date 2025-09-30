package array_leet_code;

public class binary_search {
public static void main(String[] args){
    int[] arr = {99,88,77,66,55,44,33,22,11};
    int target = 53;
    int ans = search(arr,target);
    System.out.println(ans);
}
static boolean isSorted(int[] arr){
    return arr[1] < arr[arr.length-1];
}
static int search(int[] arr, int target){
    int start = 0;
    int end = arr.length-1;
    while(start<=end){
        int mid = start + (end - start)/2;
        if(isSorted(arr)){
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        else{
            if(target > arr[mid]){
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }

    }
    return -1;
}

}
