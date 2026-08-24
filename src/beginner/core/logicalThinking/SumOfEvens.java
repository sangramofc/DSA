package beginner.core.logicalThinking;

import java.util.Scanner;

public class SumOfEvens {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the end-digit: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i % 2 == 0) ? i : 0;
        }
        System.out.println(sum);
    }
}
