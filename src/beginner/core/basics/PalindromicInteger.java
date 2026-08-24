package beginner.core.basics;

import java.util.Scanner;

public class PalindromicInteger {


    public static int getReversed(int x) {
        int n = x;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = sc.nextInt();
        System.out.println("Palindromic status: " + ((x == getReversed(x)) ? "Yes" : "No"));
    }
}
