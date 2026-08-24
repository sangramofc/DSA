package beginner.patterns;

//  For any (i, j):
//  distance = min(
//      i, -- top
//      j, -- left
//      size - i - 1, -- bottom
//      size - j - 1 -- right
//  )
//  cellValue = (n - distance)
import java.util.Scanner;

public class ConcentricSquarePattern {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int size = 2*n -1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int right = size - i - 1;
                int bottom = size - j - 1;

                int distance = Math.min(
                        Math.min(i, bottom), Math.min(right, j));

                int cellValue = n - distance;
                System.out.print(cellValue + " ");
            }
            System.out.println();
        }

    }
}
