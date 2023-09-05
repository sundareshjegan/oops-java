/*
Name : Sundareshwaran J
Roll Number : 20UIT037
Program Name : Non Access Modifiers
*/
import java.io.*;                       //import statement
class Student                           //user defined class
{
    DataInputStream scan = new DataInputStream(System.in);  //object creation
    static int rollNo = 100;                    //static variable declaration
    String name,address;            
    long mobileNo;
    //default constructor to increment the value of roll Number
    Student()
    {
        rollNo+=1;
    }
  //user defined method to get input 
    void getInput() throws Exception
    {
        System.out.println("Enter the name:");
        name = scan.readLine();
        System.out.println("Enter the mobile number:");
        mobileNo = Long.parseLong(scan.readLine());
        System.out.println("Enter the address:");
        address = scan.readLine();
    }
    //user defined method to display the values
    void display()
    {
        System.out.println(rollNo+"\n"+name+"\n"+mobileNo+"\n"+address);
    }
}
public class NonAccessModifiers
{
    public static void main(String args[])throws Exception //Main method
    {
      // Declare the neccessary variables
        DataInputStream scan = new DataInputStream(System.in);
        
      // Get the limit from the user
        System.out.println("Enter the number of students:");
        int n = Integer.parseInt(scan.readLine());
        
      //for loop to create object and call the appropriate methods
        for(int i = 0; i < n; i++)
        {
            Student s1 = new Student();
            s1.getInput();
            s1.display();
        }
    }
}





