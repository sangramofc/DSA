package beginner.core.logicalThinking;

import java.util.Scanner;

public class DaysInAMonth {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int m = sc.nextInt();

        if (m < 1 || m > 12) {
            System.out.println("Invalid month number");
        }

        if (m == 2) {
            System.out.println(28);
        } else if (m % 2 != 0 || m == 8) {
            System.out.println(31);
        } else {
            System.out.println(30);
        }
    }
}
