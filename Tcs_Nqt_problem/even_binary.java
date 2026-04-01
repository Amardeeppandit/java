package Tcs_Nqt_problem;

public class even_binary {
    public static void main(String[] args){
        Even_Odd_bin(20);
        even_binary obj = new even_binary();
        Boolean ans = obj.Even_Odd(13);
        System.out.println(ans);

    }
    public static void Even_Odd_bin(int num){
        if((num&1) ==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public Boolean Even_Odd(int num){
        return num % 2 == 0 ? true : false;
    }
}
