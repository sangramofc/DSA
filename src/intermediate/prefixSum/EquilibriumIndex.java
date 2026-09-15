package intermediate.prefixSum;

public class EquilibriumIndex {
    static void main(String[] args) {
        // int[] a = {1, 3, -5, 2, 3, 54, 16, 15};
        int[] a = {1, 2, 3, 4, 8, 10};

        int[] ps = new int[a.length];
        ps[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            ps[i] = ps[i - 1] + a[i];
        }

        int index = -1;
        for (int i = 1; i < ps.length - 1; i++) {
            int sL = ps[i - 1];
            int sR = ps[ps.length - 1] - ps[i];
            if (sL == sR) {
                index = i;
            }
        }

        System.out.println(index);
    }
}
