/*
Name : Sundareshwaran J
Roll Number : 20UIT037
Program Name : Fizz Buzz Game using Classes and Object
*/

import java.util.*;         //import Scanner class form util package
class FizzBuzz              //user defined class of Fizz Buzz Game
{
    int limit;              //instance variable declaration
    int inputCheck()        //user defined method to get limit from user
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the limit:");
        limit = scan.nextInt();
        return limit;
    }
  //user defined function of Fizz Buzz game
    void fizzBuzz()
    {
        for(int i=1;i<=limit;i++)               //for loop to generate series of numbers
        {
            if(i%3==0 && i%5==0)                //condtion to print both Fizz and Buzz
                System.out.println("Fizz Buzz");
            else if(i%3==0)                     //condition to print Fizz
                System.out.println("Fizz");
            else if(i%5==0)                     //condition to print Buzz
                System.out.println("Buzz");
            else
                System.out.println(i);          
        }
    }
}
public class FizzBuzzGame                           //Main class
{
    public static void main(String args[])
    {
        FizzBuzz fb = new FizzBuzz();       //create an object to the user defined class
        int limit = fb.inputCheck();
        if (limit<0)                        //check whether the limit is negative
            System.out.println("Please give s positive limit");
        else if(limit == 0)                 //check whether the limit is equal to zero
            System.out.println("No Operation");
        else                            
            fb.fizzBuzz();                  //function call
    }
}


