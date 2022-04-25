package lecture26Recursion;

public class RecursionExamples {

    /** Non-recursively (iterative) factorial
     *
     * @param n
     * @return factorial of n
     */
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * Recursive factorial
     * @param n
     * @return factorial of n
     */
    public static long factorial(int n) {
        if (n <= 1)
            return 1; // base case

        else
            return n * factorial(n - 1);

    }

    public static long sum(int n) {

        long result = 0;
        if (n < 0)
            throw new IllegalArgumentException();

        // FILL IN CODE
        if (n <= 1) {
            return n; // base case
        }


        result =  n + sum(n-1);
        return result;
    }

    /**
     * Recursively computes x to the power of n.
     * @param x
     * @param n
     * @return x to the power of n
     */
    public static double pow(double x, int n) {
        if (n < 0) {
            return (1.0 / x) * pow(x, n + 1);
        }
        if (n == 0)
            return 1;

        return x * pow(x, n - 1);

    }

    /**
     *
     * @param s
     * @return
     */

    public static String reverse(String s) {
        // FILL IN CODe
        if (s.isEmpty())
            return s;
        //String result  = reverse(s.substring(1)) + s.charAt(0);
        //return result;

        String result = s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
        return result;

    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if (s.isEmpty())
            return true;
        if (s.length() == 1)
            return true;

        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        return isPalindrome(s.substring(1, s.length() - 1));

    }


    public static void main(String[] args) {
        //long res = factorial(4);
        //System.out.println(res);

       // System.out.println(pow(3, 2));
       // System.out.println(pow(3, -1));
        //System.out.println(reverse("university"));
        System.out.println(isPalindrome("Hannah"));
    }

}
