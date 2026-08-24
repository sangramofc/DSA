package beginner.core.basics;
//Problem Description
//Take T (number of test cases) as input.
//For each test case, take integer N as input and Print the count of digits of that number.
import java.util.Scanner;

public class CountTheDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests : ");
        int t = sc.nextInt();
        if (t > 0) {

            for (int i = 0; i < t; i++) {
                int count = 0;
                System.out.println("Enter the " + (i + 1) + "th number: ");
                int x = sc.nextInt();
                if (x == 0) {
                    count = 1;
                } else {
                    while (x != 0) {
                        count++;
                        x /= 10;
                    }
                }


                System.out.println("Number of digits : " + count);
            }
        } else {
            System.out.println("Number of tests must be greater than 0.");
        }
    }
}
