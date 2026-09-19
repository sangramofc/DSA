package intermediate.carryForward;

import java.util.Arrays;

public class LeftMaxArray {
    static void main(String[] args) {
        int[] a = {-3,3,2,6,1,0,8,2,-9};
        for (int i = 1; i < a.length; i++) {
            a[i] = Math.max(a[i],a[i-1]);
        }
        System.out.println(Arrays.toString(a));
    }
}
