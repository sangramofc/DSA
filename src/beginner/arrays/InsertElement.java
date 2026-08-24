package beginner.arrays;

import java.util.Arrays;

public class InsertElement {
    static int[] insertElement(int[] a, int i, int x) {
        int[] n = new int[a.length + 1];
        int j = 0;
        for (; j < i; j++) {
            n[j] = a[j];
        }
        n[j++] = x;
        for (; j < a.length + 1; j++) {
            n[j] = a[j - 1];
        }
        return n;
    }

    static void main() {
        System.out.println(Arrays.toString(insertElement(new int[] {1,2,3,4,5} , 5 , 0)));
    }
}
