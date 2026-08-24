package beginner.sortingAlgorithms;

public class MaxHeapSort {

    // max-heapify function
    public static void maxHeapify(int[] a, int heapSize, int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest = i;

        if (l < heapSize && a[l] > a[largest]) largest = l;
        if (r < heapSize && a[r] > a[largest]) largest = r;

        if (largest != i) {
            // Swap
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;

            maxHeapify(a, heapSize, largest);
        }
    }

    // build-max-heap function
    public static void buildMaxHeap(int[] a) {
        int heapSize = a.length;
        for (int i = (a.length / 2) - 1; i >= 0; i--) {
            maxHeapify(a, heapSize, i);
        }
    }

    // heapsort function
    public static void heapSort(int[] a) {
        int heapSize = a.length;
        buildMaxHeap(a);
        for (int i = a.length - 1; i >= 1; i--) {

            // swapping largest el with the smaller el,
            // utilizing max-heap-property
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapSize--;
            maxHeapify(a, heapSize, 0);


        }
    }

    static void printArray(int[] A) {
        for (int x : A) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A = {8, 7, 4, 2, 9, 1, 5, 6};

        System.out.print("Before: ");
        printArray(A);

        heapSort(A);

        System.out.print("After:  ");
        printArray(A);
    }
}
