package intermediate.carryForward;

public class SpecialSubsequencesAG {

//    You have given a string A having Uppercase English letters.
//    You have to find how many times subsequence "AG" is there in the given string.
//    NOTE: Return the answer modulo 10^9 + 7 as the answer can be very large.

    static void main(String[] args) {
        String s = "ABCGAG";
        char[] c = s.toCharArray();
        long ans = 0;
        long count_A = 0;
        int MOD = 1000000007; // 10^9 + 7

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'A') {
                count_A++;
            } else if (c[i] == 'G') {
                ans = (ans + count_A) % MOD;
            }
        }

        System.out.println(ans);

    }


}
