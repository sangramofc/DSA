package beginner.core.basics;

import java.util.Scanner;

public class FirstVsLast {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String x = sc.next();
            System.out.println(x.charAt(0) + "  " + x.charAt(x.length() - 1));
        }
    }
}
