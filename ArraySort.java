/*
Name : Sundareshwaran J
Roll Number : 20UIT037
Program Name : Sorting a integer array
*/

import java.util.*;                 //import all the classes under util package
class Sort                          //user defined class to sort arrays
{
    Scanner scan = new Scanner(System.in);  //create object for Scanner class
    
    int getLimit()                  //user defined method to get limit from user
    {
        System.out.println("Enter the limit:");
        int limit = scan.nextInt();
        return limit;
    }
    
    void sort(int limit)                //user defined method to sort the array
    {
        int temp,i,j;                   //local variable declaration
        
        int arr[] = new int[limit];     //array declaration
        
      //for loop to get arrays elements from the user
        System.out.println("Enter the array elements:");
        for(i=0;i<limit;i++)
            arr[i] = scan.nextInt();
            
      //prints the array elements before sorting
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));
    
      //for loops to sort the given array    
        for(i=0;i<limit;i++)
        {
            for(j=i+1;j<limit;j++)
            {
                if (arr[i]>arr[j])
                {
                //swap the numbers and performs sorting
                    temp = arr[i];      
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
        }
      //prints the arrays elements after sorting
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));
    }
}
public class ArraySort
{
    public static void main(String[] args)
    {
        Sort s = new Sort();            //creating object to the user defined class
        
        int n = s.getLimit();           //method call
        if(n!=0)                        //check whether the limit is equal to zero or not
        {
            if(n>0)                     //check the limit is positive number or not
                s.sort(n);              //method call
            else
                 System.out.println("Please give a positive number"); //output statement
        }
        else
            System.out.print("Sorry, no operations");       //output statement
    }
}



