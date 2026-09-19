package intermediate.carryForward;

public class ClosestMinMax {
//    Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
//    and at least one occurrence of the minimum value of the array.

    static void main(String[] args) {
        int[] a = {6, 1, 1, 7, 5, 10};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }

        if (min == max) {
            System.out.println(1);
            return;
        }

        int latest_min = Integer.MIN_VALUE;
        int latest_max = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;


        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                latest_max = i;
                if (latest_min != Integer.MIN_VALUE) {
                    ans = Math.min(ans, i - latest_min + 1);
                }
            } else if (a[i] == min) {
                latest_min = i;
                if (latest_max != Integer.MIN_VALUE) {
                    ans = Math.min(ans, i - latest_max + 1);
                }

            }
        }

        System.out.println(ans);

    }

}
