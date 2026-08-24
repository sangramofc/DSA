package beginner.core.basics;

import java.util.Scanner;

public class NumberSum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the positive number: ");
        int x = sc.nextInt();
        if (x >= 0) {
            int sum = 0;
            for (int i = 1; i <= x; i++) {
                sum += i;
            }
            System.out.println("Summed value is : " + sum);
        } else {
            System.out.println("Give a positive number.");
        }

    }
}
