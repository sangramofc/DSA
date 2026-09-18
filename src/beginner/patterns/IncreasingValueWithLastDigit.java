package beginner.patterns;

import java.util.Scanner;

//  1
//  2   3
//  4   5   6
//  7   8   9   10
//  11................
//  ......................N

// N will be given, and u have to print the pattern
public class IncreasingValueWithLastDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        for (int i = 1; i > 0; i++) {

            for (int j = 1; j <= i; j++, x++) {
                if (x > n) {
                    break;
                } else {
                    System.out.print(x + "\t\t");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}
