package beginner.core.basics;

import java.util.Scanner;

public class SumTheDigits {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests : ");
        int t = sc.nextInt();
        if (t > 0) {
            for (int i = 0; i < t; i++) {

                System.out.println("Enter the  number: ");
                int x = sc.nextInt();
                if (x >= 0) {
                    int sum = 0;
                    while (x != 0) {
                        sum += x % 10;
                        x /= 10;
                    }
                    System.out.println("Summed value is : " + sum);
                } else {
                    System.out.println("Give a positive number.");
                }
            }
        } else {
            System.out.println("Number of Tests should be greater than 0");
        }
    }

}
