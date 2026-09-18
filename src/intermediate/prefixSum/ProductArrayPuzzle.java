package intermediate.prefixSum;

import java.util.Arrays;

public class ProductArrayPuzzle {
//    Given an array of integers A, find and return the product array of the same size
//    where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.
//    Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.

    static void main() {
        int[] a = {1, 2, 3, 4, 5};

        // prefix-products
        int[] pL = new int[a.length];
        pL[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            pL[i] = a[i] * pL[i - 1];
        }

        // prefix-products
        int[] pR = new int[a.length];
        pR[a.length - 1] = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            pR[i] = a[i] * pR[i + 1];
        }

        int[] ans = new int[a.length];
        ans[0] = pR[1];
        ans[a.length - 1] = pL[a.length - 2];

        for (int i = 1; i < a.length - 1; i++) {
            ans[i] = pR[i + 1] * pL[i - 1];
        }

        System.out.println(Arrays.toString(ans));

    }
}
