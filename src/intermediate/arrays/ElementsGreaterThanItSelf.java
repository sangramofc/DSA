package intermediate.arrays;

public class ElementsGreaterThanItSelf {
    static void main(String[] args) {
        int[] a = {-1, 2, -4, 0, 21, 21, 4, 6};
        int max = Integer.MIN_VALUE;
        for (int k : a) {
            max = Math.max(max, k);
        }
        int c = 0;
        for (int j : a) {
            if (j == max) c++;
        }
        System.out.println(a.length - c);
    }
}
