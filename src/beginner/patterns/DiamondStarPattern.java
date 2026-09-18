package beginner.patterns;

import java.util.Scanner;

public class DiamondStarPattern {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & 1) == 0) {
            System.out.println("Invalid input, please provide an odd number");
        } else {

            // upper-part
            int u = (n / 2) + 1;
            for (int i = 1; i <= u; i++) {

                // spaces
                for (int j = 1; j <= u - i; j++) {
                    System.out.print("  ");
                }
                // stars
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // lower-part
            int l = u - 1;
            for (int i = l; i >= 1; i--) {
                // spaces
                for (int j = 1; j <= u - i; j++) {
                    System.out.print("  ");
                }
                // stars
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }


        }
    }

}
