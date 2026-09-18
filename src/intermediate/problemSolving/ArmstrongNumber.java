package intermediate.problemSolving;

public class ArmstrongNumber {
    static int getNumberOfDigits(int n) {
        int c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }
        return c;
    }
    static boolean isArmstrongNumber(int n) {
        int digits = getNumberOfDigits(n);
        int x = n;
        int sum = 0;
        while (n != 0) {
            int base = n % 10;
            sum += (int) Math.pow(base, digits);
            n /= 10;
        }
        return x == sum;
    }

    static void main() {
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(151));
    }
}
