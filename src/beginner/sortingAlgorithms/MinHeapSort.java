package beginner.sortingAlgorithms;

public class MinHeapSort {


    public static void minHeapify(int[] a, int heapsize, int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int smallest = i;

        if (l < heapsize && a[l] < a[smallest]) {
            smallest = l;
        }
        if (r < heapsize && a[r] < a[smallest]) {
            smallest = r;
        }

        if (smallest != i) {
            int temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;

            minHeapify(a, heapsize, smallest);
        }
    }

    public static void buildMinHeap(int[] a) {
        int heapsize = a.length;
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            minHeapify(a, heapsize, i);
        }
    }

    public static void heapSort(int[] a) {
        int heapsize = a.length;
        buildMinHeap(a);

        for (int i = a.length - 1; i > 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            heapsize--;
            minHeapify(a, heapsize, 0);
        }
    }

    static void printArray(int[] A) {
        for (int x : A) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A = {
                8,
                7,
                4,
                2,
                9,
                1,
                5,
                6
        };

        System.out.print("Before: ");
        printArray(A);

        heapSort(A);

        System.out.print("After:  ");
        printArray(A);
    }
}



