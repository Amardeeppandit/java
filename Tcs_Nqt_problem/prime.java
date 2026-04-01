package Tcs_Nqt_problem;

public class prime {
    public static void main(String[] args){
        Prime(1);
    }
    public static void Prime(int num){
        boolean prime = true;
        if(num<=1){
            prime = false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0){
                prime = false;
            }
        }
        System.out.println(prime ? "Prime" : "Not prime");

    }
}
