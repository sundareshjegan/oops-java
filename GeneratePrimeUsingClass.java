/*
Name : Sundareshwaran J
Roll Number : 20UIT037
Program Name : Prime Number Generation using Classes and Object
*/
 
import java.util.Scanner;                     //import Scanner class from util package
class PrimeNoGen                        //user defined class
{
    int min,max;                        //instance variable declaration
    int arr[] = new int [2];            //array initialization
    int[] getInput()                    //user defined method to get input
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting range :");
        arr[0] = scan.nextInt();
        System.out.println("Enter the ending range :");
        arr[1] = scan.nextInt();
        return arr;                     //return array
    }
 
  //user defined function to generate prime numbers
    void generate(int min,int max)
    {
        System.out.println("The prime numbers are:");   //output Statement
        
    //for loops to generate prime numbers between given limit
        for(int i=min;i<=max;i++)
        {
            int temp =1;            //assigns 1 to a temprary variable
            for(int j =2;j<i;j++)
            {
                if(i%j==0)
                {    
                    temp = 0;
                    break;
                }
            }
            if(temp==1)
                System.out.println(i);  //output statement prints prime numbers
        }
    }
}

public class GeneratePrimeUsingClass
{
    public static void main(String args[])
    {
        PrimeNoGen prime = new PrimeNoGen();    //create object to user defined class
        int arr1[] = prime.getInput();          //call the getInput method and stores in new array
        int min = arr1[0];                      
        int max = arr1[1];
        
        if(max>0 && min>0)                  //check the limits are positive
        {
            if(min<max)                     //check the start limit is less than end limit
            {
                prime.generate(min,max);    //call generate method
            }
            else
                System.out.println("Please give starting range lesser than ending range");
        }
        else
            System.out.println("Please give the input as positive number");
    }
}






