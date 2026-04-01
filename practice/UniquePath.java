package practice;

public class UniquePath {
    public static void main(String[] args) {
        int m = 3, n = 2;
        int p = 0, k = 0;
        System.out.println("Number of unique paths: " + uniquePaths(p , k , m, n));
    }

    public static int uniquePaths(int p , int k,int m, int n) {
        if (p == m-1 && k == n-1) {
            return 1;
        }
        if (p >= m || k >= n) {
            return 0;
    } return (uniquePaths(p+1 , k , m , n) + uniquePaths(p , k+1 , m , n));
}
}
