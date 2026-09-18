package beginner.core.logicalThinking;

//Given an integer A denoting the amount of units of electricity consumed, you have to calculate the electricity bill (in Rs.) with the help of the below charge conditions:
//
//        For first 50 units Rs. 0.50/unit
//        For next 100 units Rs. 0.75/unit
//        For next 100 units Rs. 1.20/unit
//        For unit above 250 Rs. 1.50/unit
//        An additional surcharge of 20% is added to the bill.
//        NOTE: As the electricity bill can have any real value (floating point), you have to tell the floor value of the bill.
//        Floor value of a floating point is the closest integer less than or equal to that value. For eg, Floor value of 2.91 is 2.

import java.util.Scanner;

public class ElectricityBill {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Electricity consumed (Integer) : ");
        int units = sc.nextInt();
        float charge = 0f;

        if (units <= 50) {
            charge = charge + units * 0.50f;
        } else if (units <= 150) {
            charge += 50 * 0.50f + (units - 50) * 0.75f;
        } else if (units <= 250) {
            charge += 50 * 0.50f + 100 * 0.75f + (units - 150) * 1.20f;
        } else {
            charge += 50 * 0.50f + 100 * 0.75f + 100 * 1.20f + (units - 250) * 1.50f;
        }

        charge += charge * (20f / 100f);

        System.out.println("Calculated Electricity bill will be : " + (int)Math.floor(charge));

    }

}
