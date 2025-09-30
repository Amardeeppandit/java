package array_leet_code;

public class floor {
        public static void main(String[] args){
            int[] arr = {9,12,34,54,67,89};
            int target = 8;
            int ans = floor_number(arr,target);
            System.out.println(ans);
        }
        static int floor_number(int[] arr, int target){
            int start = 0;
            int end = arr.length-1;
            if(target < arr[0]){
                return -1;
            }
            while(start<=end){
                int mid = start + (end - start)/2;
                if(target < arr[mid]){
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }else{
                    return arr[mid];
                }
            }
            return arr[end];
        }

}
