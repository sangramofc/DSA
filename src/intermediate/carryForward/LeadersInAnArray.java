package intermediate.carryForward;

import java.util.ArrayList;

public class LeadersInAnArray {
//    Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
//    An element is a leader if it is strictly greater than all the elements to its right side.
//    NOTE: The rightmost element is always a leader.

    static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(a[a.length - 1]);

        int rightMax = a[a.length - 1];

        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] > rightMax) {
                rightMax = a[i];
                ans.add(rightMax);
            }
        }
        System.out.println(ans);
    }

}
