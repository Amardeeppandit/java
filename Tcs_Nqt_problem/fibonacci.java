package Tcs_Nqt_problem;

public class fibonacci {
    public static void main(String[] args){
        series(7);
    }
    public static void series(int num){
        int a = 0;
        int b = 1;
        for (int i = 1; i <= num ; i++) {
            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
