/*
Name : Sundareshwaran J
Roll Number : 20UIT037
Program Name : Challenge II - Search a Number in Fibonacci Series
*/

import java.util.Scanner;               //import scanner class
class FiboNumber                        //user defined class
{
    int limit,search,i;                 //instance variable declaration
    Scanner scan = new Scanner(System.in);
    boolean getInput()              //user defined method to get input from user
    {
        limit = scan.nextInt();     
        search = scan.nextInt();
        if (search >= 0)
        {
            if(limit >=0)
            {
                return true;
            }
            else
                System.out.println("Please give a valid range");
        }
        else
        {
            System.out.println("Search value cannot be a negative number");
        }
        return false;
    }
    // user defined method to generate fibonacci numbers
    void generateSeries()
    {   int a=-1,b=1,c=0;
        for(i = 1;i<=limit;i++)
        {
            c = a+b;
            a=b;
            b=c;
            if(i<limit)
                System.out.print(c+", ");           
        }
        System.out.println(c);
        
    }
    //user defined method to find the element in fibonacci series   
    void findElement()
    {
        int a=-1,b=1,c;
        for(i=0;i<=limit;i++)
        {
            c = a+b;
            a=b;
            b = c;
            
            if(c == search)
            {
                System.out.println("Found");    //output statement
                break;
            }
            else if(i==limit)
                System.out.println("Not Found");
        }
    }
}
public class FibonacciSearch
{
    public static void main (String[] args) //Main method
    {
        FiboNumber fn = new FiboNumber();       //create object for user defined class
        if (fn.getInput() == true )     
        {
            fn.generateSeries();        //method call
            fn.findElement();           //method call
        }
    }
}

