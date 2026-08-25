package intermediate.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotationGame {
    static void reverseArray(int[] a, int s, int e) {
        while (s < e) {
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }

    static void main(String[] args) {
        int[] a = {1, 3, -5, 2, 3, 54, 16, 151, 9};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        k %= a.length;

        reverseArray(a, 0, a.length - 1);
        reverseArray(a, 0, k - 1);
        reverseArray(a, k, a.length - 1);

        System.out.println(Arrays.toString(a));
    }
}
