package beginner.core.logicalThinking;

import java.util.Scanner;

public class PrintFrom1toN {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last digit: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
