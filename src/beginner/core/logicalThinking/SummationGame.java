package beginner.core.logicalThinking;

import java.util.Scanner;

public class SummationGame {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the end-digit : ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
