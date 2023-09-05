/*
Name : Sundareshwaran J
Roll Number : 20UIT037
Program Name : Search a Name in a give Name list
*/

import java.util.*;                 //import all the classes under util package
class Search                        //user defined class to search the name
{
    Scanner scan = new Scanner(System.in);  //create object for Scanner class
    int limit,i,result;                     //instance variable declaration
    String arr[];                           //array declaration
    
    int getLimit()                          //user defined method to get limit from user
    {
        System.out.println("Enter the limit:"); //output statement
        limit = scan.nextInt();         
        return limit;                           //returns the limit
    }
    void getNames(int limit)                    //user defined method to get names from user
    {
        arr = new String[limit];                //creating array using limit
        System.out.println("Enter the names:"); //output statement
        
    //for loop to get the names from the user
        for(i=0;i<limit;i++)                    
        {
            arr[i] = scan.next();
        }
    }
  //user defined function to search the name in name list
    void search()
    {
    //get the name from user which is to be searched in name list
        System.out.println("Enter the name to be searched:");   
        String search = scan.next();     
        
    //checks whether the given name is present or not
        result = Arrays.binarySearch(arr,search);
        if (result<0)
            System.out.println(search+" is not present in the name list");
        else
            System.out.println(search+" is present in the name list");
    }
}

public class SearchName
{
    public static void main(String[] args)
    {
        Search se = new Search();       //create object for user defined class
        int lim = se.getLimit();        //method call
        if(lim!=0)                      //checks whether the limit is equal to zero or not
        {
            if(lim>0)                   //checks the limit is positive or not
            {
                se.getNames(lim);       //method call
                se.search();            //method call
            }
            else
                System.out.println("Please give a positive number");    //output statement
        }
        else
            System.out.println("Sorry, no operations");     //output statement
    }
}
