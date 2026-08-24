package beginner.core.logicalThinking;
//Write a program to calculate the percentage (according to marks of a student) and grade (according to the percentage of a student). Five numbers(A, B, C, D & E) represent the marks of a student in 5 subjects which are out of 100. Print the percentage and the grade of the student.
//
//If percentage >= 90% : Grade A
//If percentage >= 80% but <90 : Grade B
//If percentage >= 70% but <80: Grade C
//If percentage >= 60% but <70: Grade D
//If percentage >= 40% but <60: Grade E
//If percentage < 40%: Grade F
//
//
//NOTE: You have to take the lowest integer of the percentage. E.g. 90.8% will be treated as 90%.

import java.util.Scanner;

public class PercentageAndGrade {


    public static int takeValidMarks(Scanner sc, int subjectNo) {
        System.out.println("Enter the marks of subject number " + subjectNo + " : ");
        int marks = sc.nextInt();
        if (marks > 100 || marks < 0) {
            System.out.println("Invalid marks");
            System.exit(0);
        }
        return marks;
    }

    public static char findGrade(int percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else if (percentage >= 40) {
            return 'E';
        } else {
            return 'F';
        }
    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalMarks = 0;

        for (int i = 1; i <= 5; i++) {
            totalMarks += takeValidMarks(sc, i);
        }

        int percentage = totalMarks / 5;
        System.out.println("Your percentage of marks : " + percentage);
        System.out.println("Your Grade: " + findGrade(percentage));

    }
}
