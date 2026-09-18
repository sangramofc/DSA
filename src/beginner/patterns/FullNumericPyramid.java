package beginner.patterns;

import java.util.Scanner;

public class FullNumericPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            // 0s - left - print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(0 + " ");
            }

            // increasing - print
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }

            // decreasing - print
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j + " ");
            }

            // 0s - right - print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(0 + " ");
            }
            System.out.println();

        }

    }
}
