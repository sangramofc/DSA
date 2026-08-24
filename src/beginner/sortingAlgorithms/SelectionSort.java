package beginner.sortingAlgorithms;

public class SelectionSort {

    static void selectionSort(int[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            // Find minimum element in unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap minimum with first element of unsorted part
            if (minIndex != i) {
                int temp = A[i];
                A[i] = A[minIndex];
                A[minIndex] = temp;
            }
        }
    }

    static void printArray(int[] A) {
        for (int x : A) System.out.print(x + " ");
        System.out.println();
    }

    static void main(String[] args) {
        int[] a = {8, 7, 4, 2, 9, 1, 5, 6};
        System.out.print("Selection Sort: ");
        selectionSort(a);
        printArray(a);
    }
}
