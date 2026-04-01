package practice;

public class BitOperator {

    public static void main(String[] args) {
        int n = 10;
        int x = compliment_num(n);   // calling method properly
        System.out.println(x);
    }

    public static int compliment_num(int n) {
        int x = Integer.toBinaryString(n).length();
        int mask = (1<<x)-1;
        int a = (n ^ mask);
        return (a);
    }
}