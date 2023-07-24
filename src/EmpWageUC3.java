package com.problems;

public class EmpWageUC3 {
    public static void main(String[] args) {
        double isPresent = Math.random() * 3;

        int emphour = 0;

        if (isPresent >= 2) {
            emphour = 12;
            System.out.println("Employee is present");
        }
        /*
         * 2) Added part time hour
         */
        else if (isPresent >= 1 && isPresent < 2) {
            emphour = 8;
            System.out.println("Employee is partial present");
        } else {
            System.out.println("Employee is absent");
        }
        System.out.println("Employee Working hour is " + emphour);

    }
}
