package beginner.core.logicalThinking;
//Write a program to input a number(A) from user
// and print 1 if it is positive, -1 if it is negative, 0 if it's neither positive nor negative.
import java.util.Scanner;

public class CatagoriesTheNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();

        System.out.println((x > 0) ? 1 : (x < 0) ? -1 : 0);

    }
}
