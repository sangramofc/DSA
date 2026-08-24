package intermediate.arrays;

import java.util.Arrays;

public class ReverseArray {
    static void main(String[] args) {
        int[] a = {1, 3, -5, 2, 3, 54, 16, 151, 9};
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
