package intermediate.prefixSum;

public class EquilibriumIndex {
//    You are given an array A of integers of size N.
//
//    Your task is to find the equilibrium index of the given array
//    Hey im using neovim, and randomly chose this line to edit..nothing else lol.
//    The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
//
//    If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.
//
//    Note:
//
//    Array indexing starts from 0.
//    If there is no equilibrium index then return -1.
//    If there are more than one equilibrium indexes then return the minimum index.
    static void main(String[] args) {
        // int[] a = {1, 3, -5, 2, 3, 54, 16, 15};
        int[] a = {1, 2, 3, 4, 8, 10};

        int[] ps = new int[a.length];
        ps[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            ps[i] = ps[i - 1] + a[i];
        }

        int index = -1;
        
        for (int i = 1; i < ps.length - 1; i++) {
            int sL = ps[i - 1];
            int sR = ps[ps.length - 1] - ps[i];
            if (sL == sR) {
                index = i;
            }
        }

        System.out.println(index);
    }
}
