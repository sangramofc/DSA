package intermediate.problemSolving;

public class IsPrime {
    static boolean isPrime(int n){
        int c = 0;
        for (int i = 1; i <= n / i ; i++) {
            if(n % i == 0){
                if(n/i == i) c++;
                else c += 2;
            }

        }
        return c == 2;
    }

    static void main() {
        System.out.println(isPrime(7));
        System.out.println(isPrime(18));
    }
}
