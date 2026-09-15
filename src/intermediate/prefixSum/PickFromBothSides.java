package intermediate.prefixSum;

public class PickFromBothSides {

    //You are given an integer array A of size N.
    //You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
    //Find and return the maximum possible sum of the B elements that were removed after the B operations.

    //NOTE: Suppose B = 3, and array A contains 10 elements, then you can:

    //Remove 3 elements from front and 0 elements from the back, OR
    //Remove 2 elements from front and 1 element from the back, OR
    //Remove 1 element from front and 2 elements from the back, OR
    //Remove 0 elements from front and 3 elements from the back.

    static void main() {
        int[] a = {2, 3, -1, 4, 2, 1};
        int b = 4;

        int[] ps = new int[a.length];
        ps[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            ps[i] = ps[i - 1] + a[i];
        }


        int[] ss = new int[a.length];
        ss[a.length - 1] = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            ss[i] = ss[i + 1] + a[i];
        }

        // Base case: All B elements from left or all B elements from right
        int max = Math.max(ps[b - 1], ss[a.length - b]);

        // Combinations: i elements from left (1 to b-1), and (b - i) from right
        for (int i = 1; i < b; i++) {
            int leftSum = ps[i - 1];                       // i elements from left
            int rightSum = ss[a.length - (b - i)];         // (b - i) elements from right
            int currentSum = leftSum + rightSum;

            max = Math.max(max, currentSum);
        }
        System.out.println(max);

    }

}
