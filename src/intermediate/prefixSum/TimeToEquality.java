package intermediate.prefixSum;

public class TimeToEquality {
//    Given an integer array A of size N. In one second, you can increase the value of one element by 1.
//    Find the minimum time in seconds to make all elements of the array equal.


    static void main(String[] args) {
        int[] a = {2,4,1,3,2};
        int ans = 0;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max,a[i]);
        }

        for (int i = 0; i < a.length; i++) {
         ans  += max - a[i];
        }

        System.out.println(ans);
    }
}
