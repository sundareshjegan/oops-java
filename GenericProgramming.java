/*
Name : Sundareshwaran J
Roll Number : 20UIT037
Program Name : Generic Programming
*/

import java.io.*;                   //import statement
class Arithmetic<T>                 //creating a generic class with type Type T
{
    T num1,num2;                    //creating variables of type T
  //setters method to assign values to variable
    T set_num1(T a)             
    {
        num1 = a;
        return null;
    }
    T set_num2(T b)
    {
        num2 = b;
        return null;
    }
    T get_num1()                    //getter method to return first number
    {
        return num1;
    }
    T get_num2()                    //getter method to return second number
    {
        return num2;
    }
}
public class GenericProgramming
{
    public static void main(String arg[]) throws Exception      //main method
    {
        DataInputStream scan = new DataInputStream(System.in);  //create object for DataInputStream class
        
        System.out.println("Menu\n--------\n1. Integer Values\n2. Double Values");
        System.out.println("3. String Values\nEnter your choice:");
        
        int ch = Integer.parseInt(scan.readLine());             //get the choice from user
    //switch statement 
        switch(ch)
        {
            //case for integer values
            case 1:
            {
            //get the values from the user
                System.out.println("Enter the first number:");
                int num1 = Integer.parseInt(scan.readLine());
                System.out.println("Enter the second number:");
                int num2 = Integer.parseInt(scan.readLine());
                
            //object creation and call getter and setter method
                Arithmetic<Integer> a = new Arithmetic<Integer>();
                a.set_num1(num1);
                a.set_num2(num2);
                System.out.println("Adding "+num1+" and "+num2+" results in "+(a.get_num1()+a.get_num2()));
                System.out.println("Difference between "+num1+" and "+num2+" results in "+(a.get_num1()-a.get_num2()));
                System.out.println("Product of "+num1+" and "+num2+" results in "+(a.get_num1()*a.get_num2()));
                System.out.println("Dividing "+num1+" and "+num2+" results in "+(a.get_num1()/a.get_num2()));
                
                break;
            }
            //case for double values
            case 2:
            {
                //get the values from the user
                System.out.println("Enter the first number:");
                double num1 = Double.parseDouble(scan.readLine());
                System.out.println("Enter the second number:");
                double num2 = Double.parseDouble(scan.readLine());
                
             //object creation and call getter and setter method    
                Arithmetic<Double> a = new Arithmetic<Double>();
                a.set_num1(num1);
                a.set_num2(num2);
                System.out.println("Adding "+num1+" and "+num2+" results in "+(a.get_num1()+a.get_num2()));
                System.out.println("Difference between "+num1+" and "+num2+" results in "+(a.get_num1()-a.get_num2()));
                System.out.println("Product of "+num1+" and "+num2+" results in "+(a.get_num1()*a.get_num2()));
                System.out.println("Dividing "+num1+" and "+num2+" results in "+(a.get_num1()/a.get_num2()));
                
                break;
            }
            //case for string values
            case 3:
            {
                //get the values from the user
                System.out.println("Enter the first string:");
                String str1 = scan.readLine();
                System.out.println("Enter the second string:");
                String str2 = scan.readLine();
                
                //object creation and call getter and setter method
                Arithmetic<String> a = new Arithmetic<String>();
                a.set_num1(str1);
                a.set_num2(str2);
                System.out.println("Adding "+str1+" and "+str2+" results in "+a.get_num1()+a.get_num2());
                break;
            }
        }
        
    }
        
}



