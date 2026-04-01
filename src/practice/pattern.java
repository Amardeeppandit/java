package practice;

public class pattern {
    public static void main(String[] args) {
        int n = 4;
        print31(n);
    }
    public static void printPattern(int n){
        for(int row = 1 ; row <= n*2 ; row++){
            int totalColsInRow = row > n ? 2*n-row : row;
            for(int j = 1 ; j <= totalColsInRow ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print31(int n){
        int ori = n;
        n = n*2;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int index = ori - Math.min(Math.min(i,j), Math.min(n-j,n-i))+1;
                System.out.print(index+" ");
            }
            System.out.println("");
        }

    }
}
