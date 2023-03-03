package com.bridgelabz;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = number.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
