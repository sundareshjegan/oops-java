/*
Name : Sundareshwaran J
Roll Number : 20UIT037
Program Name : Implementation of multithread programming
*/

//user defined Thread to find sum of 100 natural numbers
class Thread1 extends Thread
{
    public void run()               //run method 
    {
        int sum = 0;                //variable declaration
    //loop to find sum of 100 natural Numbers
        for(int i=1;i<=100;i++)     
            sum+=i;
        System.out.println("Sum of 100 Natural Numbers is : "+sum);
    }
}

//Thread to find product of 30 even numbers
class Thread2 extends Thread
{
    long prod = 1;              //variable declaration
    public void run()           //run method
    {
    //loop to calculate product pf 30 even numbers
        for(int i=2;i<=30;)
        {
            prod*=i;i+=2;
        }
        System.out.println("Product of 30 even numbers : "+prod);
    }
}
//Thread to find average of first 30 odd numbers    
class Thread3 extends Thread
{
    int sum = 0;            //variable declaration
    public void run()       //run method
    {
    //loop to find average of first 30 odd numbers
        for(int i=1;i<=30;)
        {
            sum+=i;i+=2;
        }
        System.out.println("Average of first 30 Odd Numbers : "+(sum/30));
    }
}
public class MulltiThreading
{
    public static void main(String a[])     //main method
    {
        Thread1 t1 = new Thread1(); //creating object for 1st thread    
        t1.start();                 //invoke start method to start the first thread
        
        Thread2 t2 = new Thread2(); //creating object for 2nd thread
        t2.start();                 //invoke start method to start second thread
        
        Thread3 t3 = new Thread3(); //creating object for 3rd thread
        t3.start();                 //invoke start method to start third thread
    }
}


