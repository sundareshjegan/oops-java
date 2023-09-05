/* 
Name : Sundareshwaran J
Roll Number : 20UIT037
Program Name : Reverse a Number using Classes and Objects
*/

import java.util.*;             //import Scanner class from util package
class Reverse                   //user defined class to reverse a number
{
    void reverse(int number)    //user defined method to reverse a number
    {
        int remainder,rev =0;   //local variable declaration
        
    //while loop to reverse the given number
        while(number > 0)
	    {
	        remainder = number%10;
	        rev = (rev*10) + remainder;
	        number = number /10;
	    }
	    System.out.println(rev);            //print reversed number
    }
}
public class ReverseNumeber
{
    public static void main(String[] args)
    {
     //get the number from the user    
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter the number :");   //output statement
        int n = s.nextInt();
        
        Reverse r = new Reverse();      //object is created for user defined class
        r.reverse(n);                   //method call with number as argument
    }
}


