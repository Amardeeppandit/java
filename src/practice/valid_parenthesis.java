package practice;

public class valid_parenthesis {

        static int n = 2;   // number of pairs

        public static void main(String[] args) {
            backtrack("", 0, 0);
        }

        public static void backtrack(String s, int open, int close) {

            // base condition
            if (s.length() == 2 * n) {
                System.out.println(s);
                return;
            }

            // add '(' if allowed
            if (open < n) {
                backtrack(s + "(", open + 1, close);
            }

            // add ')' if valid
            if (close < open) {
                backtrack(s + ")", open, close + 1);
            }
        }
}
