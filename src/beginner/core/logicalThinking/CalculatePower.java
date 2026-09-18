package beginner.core.logicalThinking;

import java.util.Scanner;

public class CalculatePower {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int base = sc.nextInt();
        System.out.println("Enter the power : ");
        int power = sc.nextInt();

        // calculating power
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }

        System.out.println(result);

    }
}
