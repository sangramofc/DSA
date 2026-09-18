package beginner.core.logicalThinking;

import java.util.Scanner;

public class MInOfThree {

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int y = sc.nextInt();
        System.out.println("Enter 3rd number : ");
        int z = sc.nextInt();


        System.out.println(
                (x < y && x < z) ? x + " is the minimum number"
                        : (y < x && y < z) ? y + " is the minimum number"
                          : (z < x && z < y) ? z + " is the minimum number"
                            : "All numbers are same"
        );

    }
}
