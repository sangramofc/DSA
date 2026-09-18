package beginner.core.logicalThinking;
//Write a program to input three numbers(A, B & C) from user
// and print the maximum element among A, B & C in each line.

import java.util.Scanner;

public class MaxOfThree {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number : ");
        int x = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int y = sc.nextInt();
        System.out.println("Enter the 3rd number : ");
        int z = sc.nextInt();

        if (x > y && x > z) {
            System.out.println(x + " is the largest number.");
        } else if (y > x && y > z) {
            System.out.println(y + " is the largest number.");
        } else if (z > x && z > y) {
            System.out.println(z + " is the largest number.");
        } else {
            System.out.println("All the given numbers are same.");
        }


    }

}
