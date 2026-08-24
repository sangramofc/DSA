package beginner.core.basics;

import java.util.Scanner;

public class PrintPrimes {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(2+" ");
        for (int i = 3; i <= x; i += 2) {
            int j = 3;
            for (; j < i; j += 2) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                System.out.print(j+" ");
            }
        }
    }
}
