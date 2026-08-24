package beginner.core.logicalThinking;

import java.util.Scanner;

public class CheckEvenOdd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = sc.nextInt();

        System.out.println((x % 2 == 0) ? "Even" : "Odd");
    }
}
