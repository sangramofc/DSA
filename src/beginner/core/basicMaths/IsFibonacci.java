package beginner.core.basicMaths;

public class IsFibonacci {
    // method 1 - by checking perfect squares O(1)
    static boolean isPerfectSquare(long n) {
        long s = (long) Math.sqrt(n);
        return s * s == n;
    }

    static boolean isFibonacciV1(long n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    // method 2 - naive approach by iterating all possible fibonacci(s) O(n)
    public static boolean isFibonacciV2(int n) {
        int a = 0, b = 1;

        while (a <= n) {
            if (a == n) {
                return true;
            }

            int c = a + b;
            a = b;
            b = c;
        }

        return false;
    }
}
