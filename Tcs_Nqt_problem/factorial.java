package Tcs_Nqt_problem;

public class factorial {
    public static void main(String[] args){
        fact(5);
    }
    public static void fact(int num){
        int fact = 1;
        for(int i = 1 ; i <= num ; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
