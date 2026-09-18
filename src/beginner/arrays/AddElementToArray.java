package beginner.arrays;

import java.util.Arrays;

public class AddElementToArray {
    static int[] addElementToArray(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            a[i] += n;
        }
        return a;
    }

    static void main() {
        System.out.println(Arrays.toString(addElementToArray(new int[]{1, 2, 3, 4}, 3)));
    }
}
