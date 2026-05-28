package sortingAlgorithms;

public class BubbleSort {

    static void bubbleSort(int[] A) {
        int n = A.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;  // Reset flag at start of each pass

            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    // Swap
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;

                    swapped = true;  // Flag: swapping happened
                }
            }

            // If no swapping happened, array is already sorted
            if (!swapped) {
                break;  // Exit early - no need for more passes
            }
        }
    }
    static void printArray(int[] A) {
        for (int x : A) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {8, 7, 4, 2, 9, 1, 5, 6};
        System.out.print("Bubble Sort: ");
        bubbleSort(a);
        printArray(a);

    }


}
