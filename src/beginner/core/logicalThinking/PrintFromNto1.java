package beginner.core.logicalThinking;

import java.util.Scanner;

public class PrintFromNto1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last digit: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
