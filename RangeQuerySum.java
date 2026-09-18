package intermediate.prefixSum;

import java.util.ArrayList;
import java.util.Arrays;

public class RangeQuerySum {
//    You are given an integer array A of length N.
//    You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
//    For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
//    More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

    static void main() {
        int[] a = {1, 2, 3, 4, 5};
        int[][] b = {
                {0, 3}, {1, 2}
        };
        int n = a.length;

        int[] ps = new int[n];
        ps[0] = a[0];
        for (int i = 1; i < n; i++) {
            ps[i] = ps[i - 1] + a[i];
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            int l = b[i][0];
            int r = b[i][1];

            int sum;
            if (l == 0) {
                sum = ps[r];
            } else {
                sum = ps[r] - ps[l - 1];
            }

            ans.add(sum);
        }

        System.out.println(Arrays.toString(ans.toArray()));
    }
}
