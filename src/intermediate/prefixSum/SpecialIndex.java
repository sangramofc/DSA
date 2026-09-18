package intermediate.prefixSum;

public class SpecialIndex {
//    Given an array, arr[] of size N, the task is to find the count of array indices
//    such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.

    static void main() {
//      int[] a = {5, 5, 2, 5, 8};
        int[] a = {1,1,1};
        int c = 0;
        int evenL = 0;
        int oddL = 0;

        // alternating suffix sum
        int[] ss = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            ss[i] = a[i];
            if (i + 2 < a.length) {
                ss[i] = a[i] + ss[i + 2];
            }
        }

        for (int i = 0; i < a.length; i++) {
            int evenR = 0;
            int oddR = 0;

            if (i % 2 == 0) {
                if (i + 1 < a.length) evenR += ss[i + 1];
                if (i + 2 < a.length) oddR += ss[i + 2];
            } else {
                if (i + 1 < a.length) oddR += ss[i + 1];
                if (i + 2 < a.length) evenR += ss[i + 2];
            }

            if (evenL + evenR == oddL + oddR) c++;
            if (i % 2 == 0) {
                evenL += a[i];
            } else {
                oddL += a[i];
            }
        }

        System.out.println(c);
    }


}
