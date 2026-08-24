package beginner.core.basics;

import java.util.Scanner;

public class HCFByLoop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), hcf = 1;
        if(a % b == 0){
            System.out.println(Math.min(a,b));
        }
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}
