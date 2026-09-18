package beginner.arrays;

public class NegativeElements {
    static void main() {
        int[] a = {1, -2, 3, 4, -5, 6, -7, 8, -9};
        for (int i : a) {
            if (i < 0) {
                System.out.print(i + " ");
            }
        }
    }
}
