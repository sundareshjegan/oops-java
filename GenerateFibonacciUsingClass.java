/*
Name : Sundareshwaran J
Roll Number : 20UIT037
Program Name : Fibonacci Series Generation using Classes and Object
*/

import java.util.Scanner;           //import Scanner class from util package
class FiboGen                       //create user defined class                        
{
    int n;                          // variable declaration
    
  //user defined method to generate fibonacci series
    int generateSeries(int n)       
    {
        if(n==0 || n==1)
            return n;
        else
            return generateSeries(n-1)+generateSeries(n-2);
    }
}

public class GenerateFibonacciUsingClass
{
    public static void main(String[] args)
    {
        int num;                            //variable declaration
        Scanner s = new Scanner(System.in);
    //get the limit value from the user
    
        System.out.println("Enter the limit:");
        num = s.nextInt();          
        FiboGen f = new FiboGen();          //create object to the user defined class
        
        if (num>0)
        {
        System.out.println("Fibonacci Series are:");    //output statement
        for(int i=0;i<num;i++)                          //for loop to print fibonacci series
        System.out.println(f.generateSeries(i));
        }
        else
        System.out.println("Please give a positive number"); //output statement
    }
}

