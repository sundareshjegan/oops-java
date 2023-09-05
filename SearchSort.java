/*
Name : Sundareshwaran J
Roll Number : 20UIT037
Program Name : Perform String operations using ArrayList
*/

import java.util.*;             //import util package
//user defined class to perform string operations
class SortSearch
{
    int limit;                                      //variable declaration
    Scanner scan = new Scanner(System.in);              //object creation
    ArrayList<String> arr = new ArrayList<String>();    //creating arrayList
  
  //user defined method to get the input names
    void getInput()
    {
        System.out.println("Enter the total number of names : ");
        limit = scan.nextInt();
    //loop to get the input names
        for(int i=0;i<limit;i++)
        {
            System.out.print("Enter name "+(i+1)+" : ");
            arr.add(scan.next());
        }
    }
    //user defined method to sort the names
    void sort()
    {
        System.out.println("Array before Sorting : \n"+arr);
        Collections.sort(arr);
        System.out.println("Array after sorted : \n"+arr);
    }
    //user defined to search a particular name in arraylist
    void search()
    {
        System.out.println("Enter the name to be searched : ");
        String search = scan.next();
        if(arr.contains(search))
            System.out.println("The name "+search+" is present.");
        else
           System.out.println("The name "+search+" is not present."); 
    }
}
class Main              //Main class
{
    public static void main(String a[])     //main method
    {
        SortSearch ss = new SortSearch();   //object creation for user defined class
        ss.getInput();                      //method call
        
        //do while loop to perform string operations
        do
        {
            System.out.print("\t\tCHOICES\n\t\t=======\n1.Sort\n2.Search\nEnter your choice : ");
            int choice = ss.scan.nextInt();
            switch(choice)          //switch case
            {
                case 1:
                    ss.sort();      //method call to sort the array
                    break;
                case 2:
                    ss.search();    //method call to search a name in arraylist
                    break;
            }
            System.out.print("Do you want to continue : ");
        }while((ss.scan.next().toLowerCase()).equals("yes"));
    }
}




