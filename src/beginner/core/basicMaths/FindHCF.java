package beginner.core.basicMaths;

import java.util.Scanner;

public class FindHCF {

    public static int getHCF(int a, int b) {
        if (a == 0) return b;
        return getHCF(b % a, a); // Euclid Algorithm
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(getHCF(sc.nextInt(),sc.nextInt()));
        }
    }
}
