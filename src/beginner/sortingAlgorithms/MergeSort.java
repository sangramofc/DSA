package beginner.sortingAlgorithms;

public class MergeSort {

    public static void merge(int[] a, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] lA = new int[n1 + 1];
        for (int i = 0; i < n1; i++) lA[i] = a[p + i];
        lA[n1] = Integer.MAX_VALUE;


        int[] rA = new int[n2 + 1];
        for (int i = 0; i < n2; i++) rA[i] = a[q + 1 + i];
        rA[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        // Note:
        // you cannot write (k = 0 to k <= A.length - 1) :: that would be wrong and would break the algorithm!
        // The merge function only merges one specific subarray, not the entire array.
        for (int k = p; k <= r; k++) {
            if (lA[i] <= rA[j]) {
                a[k] = lA[i++];
            } else {
                a[k] = rA[j++];
            }
        }
    }

    public static void mergeSort(int[] a, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(a, p, q);
            mergeSort(a, q + 1, r);
            merge(a, p, q, r);
        }
    }

    public static void printArray(int[] a) {
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }

    static void main(String[] args) {
        int[] a = {8, 7, 4, 2, 9, 1, 5, 6};

        System.out.print("Before: ");
        printArray(a);

        mergeSort(a, 0, a.length - 1);

        System.out.print("After:  ");
        printArray(a);
    }


}
