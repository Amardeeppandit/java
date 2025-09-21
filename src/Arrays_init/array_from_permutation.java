package Arrays_init;

public class array_from_permutation {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int n = nums.length;
        int[] ans = buildArray(nums, n);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }

    // method inside the class
    public static int[] buildArray(int[] arr, int n) {
        int[] result = new int[n];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr[i]];
        }
        return result;
    }
}
