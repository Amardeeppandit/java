package pattern;

public class pattern {
    public static void main(String[] args) {
        int n = 4;
        int i = 1;

        while (i <= n) {
            int space = 1;
            while (space <= n - i) {
                System.out.print(" ");
                space++;
            }

            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
