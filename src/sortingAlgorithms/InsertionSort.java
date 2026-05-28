package sortingAlgorithms;

public class InsertionSort {

    static void insertionSort(int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            int key = A[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;
            }
            // Insert key at correct position
            A[j + 1] = key;
        }
    }

    static void printArray(int[] A) {
        for (int x : A) System.out.print(x + " ");
        System.out.println();
    }

    static void main(String[] args) {

        int[] a = {8, 7, 4, 2, 9, 1, 5, 6};
        System.out.print("Insertion Sort: ");
        insertionSort(a);
        printArray(a);
    }

}
