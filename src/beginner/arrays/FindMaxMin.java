package beginner.arrays;

public class FindMaxMin {
    static void main() {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] a = {1, 2, 34, 4, 5, 6};
        for (int x : a) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        System.out.println(min + " " + max);
    }
}
