package lecture26Recursion;

public class RecursionExamples {

    /** Non-recursive (iterative) factorial
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
        if (n <= 1) // base case
            return 1;

        else // recursive case
            return n * factorial(n - 1);

    }

    public static long sum(int n) {
        long result = 0;
        if (n < 0)
            throw new IllegalArgumentException();

        if (n <= 1) { // base case
            return n; // base case
        }


        result =  n + sum(n-1);
        return result;
    }

    public int fib(int n) {
        // FILL IN CODE
        // Add base cases

        // Add a recursive case

        return 0; // change
    }

    /**
     * Recursively computes x to the power of n.
     * @param x
     * @param n
     * @return x to the power of n
     */
    public static double pow(double x, int n) {
        if (n == 0) // base case
            return 1;

        if (n < 0) {
            return (1.0 / x) * pow(x, n + 1);
        }
        else
            return x * pow(x, n - 1);

    }

    public static double powAlternativeImplementation(double x, int n) {
        // FILL IN CODE
        // if n is even, x^n = x^(n/2) * x^(n/2)
        // if n is odd, x^n = x * x^(n/2) * x^(n/2)

        return 0; // change
    }

    /**
     *
     * @param s
     * @return
     */

    public static String reverse(String s) {
        if (s.isEmpty()) // Base case
            return s;

        // Recursive case
        String result = s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
        return result;
    }

    public static String reverseAlternativeImplementation(String s) {
        // FILL IN CODE:
        // Reverse the substring from index 1 until the end of s, and append the first letter of s
        // Ex: to reverse "crane", we can reverse "rane" to get "enar" and then append a "c" to get
        // "enarc".
        if (s.isEmpty()) // base case
            return s;

        return ""; // change
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
