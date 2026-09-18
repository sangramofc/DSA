package beginner.patterns;

import java.util.Scanner;

public class HollowDiamondPattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & 1) == 1) {

            // upper-part
            int u = (n / 2) + 1;
            for (int i = 1; i <= u; i++) {

                // external-spaces
                for (int j = 1; j <= u - i; j++) {
                    System.out.print("  ");
                }
                // stars & internal-spaces
                for (int j = 0; j <= 2 * i - 1; j++) {

                    // stars
                    if (j == 1 || j == 2 * i - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            // lower-part
            int l = u - 1;
            for (int i = l; i >= 1; i--) {
                // external-spaces
                for (int j = 1; j <= u - i; j++) {
                    System.out.print("  ");
                }
                // stars & internal-spaces
                for (int j = 0; j <= 2 * i - 1; j++) {

                    // stars
                    if (j == 1 || j == 2 * i - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

        }
    }
}
