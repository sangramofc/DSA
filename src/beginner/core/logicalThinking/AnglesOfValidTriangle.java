package beginner.core.logicalThinking;

import java.util.Scanner;

public class AnglesOfValidTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle no. 1: ");
        int a1 = sc.nextInt();
        System.out.println("Enter angle no. 2: ");
        int a2 = sc.nextInt();
        System.out.println("Enter angle no. 3: ");
        int a3 = sc.nextInt();

        if (a1 <= 0 || a2 <= 0 || a3 <= 0) {
            System.out.println("Invalid Triangle.");
        } else if (a1 + a2 + a3 == 180) {
            System.out.println("Valid Triangle.");
        } else {
            System.out.println("Invalid Triangle.");
        }
    }
}
