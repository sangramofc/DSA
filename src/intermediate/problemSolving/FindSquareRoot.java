package intermediate.problemSolving;

public class FindSquareRoot {
    static int getSqrt(int n) {
        int s = 1;
        int e = n;
        int ans = 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid == n / mid) return mid;
            else if (mid * mid > n) {
                e = mid - 1;
            } else {
                ans = mid; // storing the largest possible answer (for floating Square Root)
                s = mid + 1;
            }
        }
        return ans;
    }

    static void main() {
        System.out.println(getSqrt(8));
    }
}
