package beginner.core.logicalThinking;

import java.util.Scanner;

public class WhichTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle 1: ");
        int a1 = sc.nextInt();
        System.out.println("Enter angle 2: ");
        int a2 = sc.nextInt();
        System.out.println("Enter angle 3: ");
        int a3 = sc.nextInt();

        // checking whether given angles are valid or not
        if (a1 > 0 && a2 > 0 && a3 > 0 && (a1 + a2 + a3 == 180)) {
            if (a1 == 60 && a2 == 60 && a3 == 60) {
                System.out.println("Equilateral");
            } else if (a1 == a2 || a2 == a3 || a1 == a3) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Invalid angle values");
        }
    }
}
