package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("num1");
        int num1= sc.nextInt();

        Scanner ss=new Scanner(System.in);
        System.out.println("num2");
        int num2= sc.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1:-" +num1);
        System.out.println("num2:-" + num2);
    }
}
