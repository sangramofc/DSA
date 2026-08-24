package intermediate.problemSolving;

public class IsItPerfect {
//    Given the Number of Test Cases as T,
//    For each test case, take an integer N as input, you have to tell whether it is a perfect number or not.

//    A perfect number is a positive integer that is equal to the sum of its proper positive divisors (excluding the number itself).
//    A positive proper divisor divides a number without leaving any remainder.
    public static boolean isPerfect(int x){
        if(x < 0) return false;

        int sum = 1;
        for(int i = 2;i * i <=x;i++){
            if(x % i == 0) {
                if(i == x/i) {
                    sum += i;
                } else {
                    sum += (i + x/i);
                }
            }
        }
        return sum  == x;
    }


    static void main() {
        System.out.println(isPerfect(-28));
        System.out.println(isPerfect(28));
    }
}
