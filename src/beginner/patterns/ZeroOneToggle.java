package beginner.patterns;

import java.util.Scanner;

public class ZeroOneToggle {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(t+" ");
                t = 1 - t;
            }
            System.out.println();
        }
    }

}
