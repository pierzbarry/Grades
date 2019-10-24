package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
        int temp;
        boolean prime = true;

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter any number:");

        //capture the input in an integer
        int num = scan.nextInt();


        for(int i = 2; i <= num / 2; i++)
        {
            temp = num%i;
            if(temp == 0)
            {
                prime = false;
                break;
            }
        }
        //If isPrime is true then the number is prime, else not

        if(prime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }
}