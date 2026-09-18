package beginner.patterns;

import java.util.Scanner;

public class ButterflyPattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & 1) == 1) {
            // upper-part
            for (int i = 1; i <= n / 2; i++) {
                for (int j = 1; j <= n; j++) {
                    // stars
                    if (j <= i || j > n - i) {
                        System.out.print("* ");
                    }
                    // spaces
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            // mid-part
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }


            System.out.println();
            // lower-part
            for (int i = n / 2; i >= 1; i--) {
                for (int j = 1; j <= n; j++) {
                    // stars
                    if (j <= i || j > n - i) {
                        System.out.print("* ");
                    }
                    // spaces
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

        }
    }
}
