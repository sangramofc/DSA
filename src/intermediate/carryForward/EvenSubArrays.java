package intermediate.carryForward;

import java.util.Scanner;

public class EvenSubArrays {
//    You are given an integer array A.
//    Decide whether it is possible to divide the array into one or more subarrays of even length such that the first and last element of all subarrays will be even.
//    Return "YES" if it is possible; otherwise, return "NO" (without quotes).

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (a.length % 2 != 0) {
            System.out.println("NO");
        } else {
            if (a[0] % 2 != 0 || a[a.length - 1] % 2 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }
}