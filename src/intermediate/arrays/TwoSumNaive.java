package intermediate.arrays;

// O(N^2)

public class TwoSumNaive {
    static void main(String[] args) {
        int[] a = {1,3,-5,2,3,54,16,15};
        int k = 10;
        boolean f = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i] + a[j] == k && i != j){
                    f = true;
                }
            }
        }
        System.out.println(f);
    }
}
