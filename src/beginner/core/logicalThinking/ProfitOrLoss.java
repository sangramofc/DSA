package beginner.core.logicalThinking;

// You are given the Cost Price C and Selling Price S of a Product. You have to tell whether there is a Profit or Loss. Also, calculate total profit or loss.
//
//NOTE: It is guaranteed that Cost Price and Selling Price are not equal.
//
//NOTE: You have to take input of the Cost Price(C) and Selling Price(S) from the user.

import java.util.Scanner;

public class ProfitOrLoss {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price: ");
        int c = sc.nextInt();
        System.out.println("Enter selling price: ");
        int s = sc.nextInt();

        System.out.println((s > c) ? 1 : -1);
        System.out.println(Math.abs(s - c));
    }
}
