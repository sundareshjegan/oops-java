/*
Name : Sundareshwaran J
Roll Number : 20UIT037
Program Name : Factorial of a Number
*/

import java.util.Scanner;           //import Scanner class from util package

public class Factorial
{
    public static void main(String arg[])
    {
        int i,number,fact=1;                        //variable declaration
        
    //Get the number from user to find factorial
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");    //output statement        
        number = scan.nextInt();
        scan.close();

        
    //for loop to find factorial of a number
        for(i=1;i<=number;i++)
            fact = fact*i;
            
        System.out.println(number+"! = "+fact);     //output statement
    }
}

