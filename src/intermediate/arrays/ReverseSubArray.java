package intermediate.arrays;

import java.util.Arrays;

public class ReverseSubArray {
    static void main(String[] args) {
        int[] a = {1, 3, -5, 2, 3, 54, 16, 151, 9};
        int e = 5;
        int s = 2;
        while (s < e) {
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
        System.out.println(Arrays.toString(a));
    }
}
