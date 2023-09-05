/*
Name : Sundareshwaran J
Roll Number : 20UIT037
Program Name : Palindrome Checking
*/

import java.util.Scanner;               //import Scanner class from util package

public class PalindromeCheck
{
	public static void main(String[] arg) 
	{
	    int number,original_number,rem,pali=0;      //variable declaration
	    
	    //Get the input number from the user to check palindrome or not
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the number:");    //output statement   
	    number = s.nextInt();
	    
	    original_number = number;                   //assign the number to another variable
	    
	   //while loop to reverse the given number
	    while(number != 0)
	    {
	        rem = number%10;
	        pali = pali*10 +rem;
	        number /=10;
	    }
	   
	   //Condition to check the given number is palindrome or not 
	    if(pali == original_number)
		    System.out.println(original_number+" is a palindrome number");
		else
		    System.out.println(original_number+" is not a palindrome number");
	}
}

