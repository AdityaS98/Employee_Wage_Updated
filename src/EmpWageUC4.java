package com.problems;
import java.util.Scanner;

public class EmpWageUC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ispresent = Math.random()*3;

        /*
         *2) To convert random number into integer to use in switch case
         */

        Double newData = new Double(ispresent);
        int value = newData.intValue();

        /*
         *3) To check the attendance of employee used switch case
         */

        switch (value) {
            case 1:
                /*
                 * 4) To Print if employee is present
                 */
                System.out.println("Employee is present");
                break;
            case 2:
                /*
                 * 5) To Print if employee is partialy present
                 */
                System.out.println("Employee is partialy present");
                break;
            default:
                /*
                 * 6) To Print if employee is absent
                 */
                System.out.println("Employee is absent");
        }
    }
}
