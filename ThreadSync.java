/*
Name : Sundareshwaran J
Roll Number : 20UIT037
Program Name : Thread synchronization – Producer consumer problem
*/
import java.util.Scanner;             //import util package
import java.io.*;               //import io package
class base                      //user definedd class 
{
	int data;           //variable declaration
	boolean available = false;
	//synchronized method to to enque the data
	synchronized void enqueue(int x)
	{
		if(available)
		{
		try             //try block
		{
			wait();
		}
		catch(InterruptedException ie)  //catch block
		{
			System.out.println(ie);
		}
		}
		data = x;
		System.out.println("The item is produced "+data);		
		available = true;
		notify();
	}
	//user defined synchronized method to dequeue the data
	synchronized void dequeue()
	{
		if(!available)
		{
		try
		{
			wait();
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		}
		System.out.println("The consumed data is "+data);
		available = false;
		notify();
	}
}
//thread class 
class producer extends Thread
{
	base b;
	int capacity,rear=0;        //variable initialization
	producer(base b,int capacity)       //parameterized constructor
	{
		this.b = b;
		this.capacity = capacity;
		
	}
	public void run()           //run method 
	{
		while(capacity>rear)		
			b.enqueue(rear++);
	}
}
//user defined thread class(consumer)
class consumer extends Thread
{
	base b;     //variable declaration
	int capacity,front=0;
	consumer(base b1,int capacity)          //parameterized constructor
	{
		b = b1;
		this.capacity = capacity;
	}
	public void run()                   //run method
	{
		while(capacity>front)
		{
			b.dequeue();
			front++;
		}
	}
}	
public class ThreadSync
{
	public static void main(String arg[])       //Main method
	{
		base b1 = new base();           //create object for the thread class
		System.out.println("Enter the capacity : ");
		Scanner scan = new Scanner(System.in);
		int capacity = scan.nextInt();
		if(capacity >=0)
		{
		    producer p1 = new producer(b1,capacity);
		    consumer c1 = new consumer(b1,capacity);
		    p1.start();         //start thread
		    c1.start();         //start theread
		}
		else
		    System.out.println("Please specify the valid capacity.");
	}
}






