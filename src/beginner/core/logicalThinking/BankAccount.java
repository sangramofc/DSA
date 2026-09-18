package beginner.core.logicalThinking;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank Balance : ");
        int bankBalance = sc.nextInt();

        if (bankBalance < 0) {
            System.out.println("Invalid Initial balance");
            return;
        }

        int opt;
        do {
            System.out.println("\nEnter - \n 1 for Credit \n 2 for Debit \n 3 for Check Balance \n 4 to Exit");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Enter the amount to be credited: ");
                    int credit = sc.nextInt();
                    if (credit < 0) {
                        System.out.println("Invalid amount");
                        break;
                    }
                    bankBalance += credit;
                    System.out.println("Amount credited successfully.");
                    break;

                case 2:
                    System.out.println("Enter the amount to be debited: ");
                    int debit = sc.nextInt();
                    if (debit < 0) {
                        System.out.println("Invalid amount");
                        break;
                    }
                    if (debit > bankBalance) {
                        System.out.println("Transaction Failed due to insufficient bank balance.");
                        break;
                    }
                    bankBalance -= debit;
                    System.out.println("Amount debited successfully.");
                    break;

                case 3:
                    System.out.println("Current Bank Balance is : " + bankBalance);
                    break;

                case 4:
                    System.out.println("Thank you for using our banking service. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid operation code.");
            }

        } while (opt != 4);
    }
}