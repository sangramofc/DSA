package beginner.patterns;

import java.util.Scanner;

public class V_Shape_Pattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = 2 * r - 1;

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {

                // Stars
                if (j == i || j == c - i + 1) {
                    System.out.print("*");
                }
                // Spaces
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
