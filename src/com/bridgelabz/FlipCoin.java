package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int headC=0;
        int tailC=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times of flip coin:-");
        double count=sc.nextInt();
        for (int i=0;i<count;i++){
            double random=Math.random();
            System.out.println(random);
            if(random<0.5){
                tailC++;
            }else{
                headC++;
            }
        }
        double head=headC/ count*100;
        double tail=tailC/ count*100;
        System.out.println("The percentage of Head is " +head +"%");
        System.out.println("The percentage of Tail is " +tail +"%");
    }
}
