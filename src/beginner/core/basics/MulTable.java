package beginner.core.basics;

import java.util.Scanner;

public class MulTable {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter the number : ");
        x = sc.nextInt();

        System.out.println("10 multiples of " + x + " are : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print((x * i) + " ");
        }
    }
}
