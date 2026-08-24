package beginner.patterns;

import java.util.Scanner;

public class HollowTrianglePattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & 1) == 1) {

            int i = 1;
            for (; i <= n - 1; i++) {

                // spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                // stars & internal spaces
                for (int j = 1; j <= 2 * i - 1; j++) {
                    // stars
                    if (j == 1 || j == 2 * i - 1) {
                        System.out.print("* ");
                    }
                    // spaces
                    else {
                        System.out.print("  ");
                    }

//
//                    System.out.print("* ");
                }


                System.out.println();
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
        }
    }
}
