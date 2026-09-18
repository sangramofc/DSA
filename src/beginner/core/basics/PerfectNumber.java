package beginner.core.basics;
//    A perfect number is a positive integer that is equal to the sum of its proper positive divisors (excluding the number itself).
//    A positive proper divisor divides a number without leaving any remainder.

import java.util.Scanner;

public class PerfectNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int x = sc.nextInt();
            int sum = 0;
            for (int j = 1; j < x; j++) {
                if (x % j == 0) {
                    sum += j;
                }
            }

            if (sum == x) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
