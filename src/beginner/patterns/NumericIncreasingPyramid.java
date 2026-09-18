package beginner.patterns;

import java.util.Scanner;

public class NumericIncreasingPyramid {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {

            // Spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print("  ");
            }

            // Increasing Numbers
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }
            // Decreasing Numbers
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
