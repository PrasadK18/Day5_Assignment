package com.bridgelabz;

import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of Divident");
        int dividend= sc.nextInt();
        System.out.println("enter the value of Divisor");
        int divisor= sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient is " + quotient);
        System.out.println("Remainder is " + remainder);
    }
}
