package beginner.core.logicalThinking;

import java.util.Scanner;

public class VowelOrConsonant {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = sc.next().toLowerCase().charAt(0);

        System.out.println(
                (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Vowel"
                        : "Consonant"
        );
    }
}
