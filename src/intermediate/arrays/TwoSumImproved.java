package intermediate.arrays;

// O(n^2) but with lesser iterations - (checking upper-triangle only, from the matrix of all possible indices)

public class TwoSumImproved {
    static void main(String[] args) {
        int[] a = {1, 3, -5, 2, 3, 54, 16, 151, 9};
        int k = 10;
        boolean f = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == k) {
                    f = true;
                }
            }
        }
        System.out.println(f);
    }
}
