package beginner.patterns;

import java.util.Scanner;

public class HollowSquarePattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (i == 1 || i == r) {
                    System.out.print("*  ");
                } else {
                    if (j == 1 || j == r) {
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}
