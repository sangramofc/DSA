package intermediate.carryForward;

public class AmazingSubarrays {

//    You are given a string S, and you have to find all the amazing substrings of S.
//    An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

//    Input : Only argument given is string S.
//    Output : Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.


    static void main(String[] args) {
        String s = "AeIoU";
        char[] c = s.toCharArray();
        int ans = 0;
        for (int i = 0; i < c.length; i++) {
            char ch = c[i];
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ans = (ans + (c.length - i)) % 10003;
            }

        }
        System.out.println(ans);
    }
}
