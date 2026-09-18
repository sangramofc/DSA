package beginner.core.logicalThinking;

import java.util.Scanner;

// Take an integer A as input.
// You have to tell whether A is divisible by both 5 and 11 or not.
public class DivisibleByTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();

        System.out.println((x % 5 == 0 && x % 11 == 0) ? 1 : 0);
    }

}
