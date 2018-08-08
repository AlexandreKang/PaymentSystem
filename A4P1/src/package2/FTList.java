// -----------------------------------------------------
// Assignment #4
//
// Written by: Alexandre Kang, 40027204
// -----------------------------------------------------

package package2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import package1.FullTime;

public class FTList {
	private static int highest;
	private static int lowest;
	private static int findHighest;
	private static int findLowest;
	

	private class Node
	{
		private int v;
		private Node next;	// A link to the next node, which is of type Node1
		
		// Default constructors 
		public Node()
		{
			v = 0;
			next = null;
		}
		
		// Parameterized constructor 
		public Node(int i, Node xt)
		{
			v = i;
			next = xt;
		}
	} // end of inner class Node
	
	private static Node head;

	public FTList()
	{
		head = null;
	}
	
	public void addAtEnd(int i)
	{
		if(head == null)
			head = new Node(i, head);	
	
		else
		{
		Node t = head;
		while(t.next != null)
			t = t.next;
		t.next = new Node(i, t.next);
		}
	}
	
	public void showListContents()
	{
		Node temp = head;
		if (temp == null)
			System.out.println("There is nothing to display; list is empty." );
		else
			System.out.println("Here are the contents of the list." );
		while(temp != null)
		{
			System.out.print(temp.v + " ---> ");
			temp = temp.next;		// Move to the next node
		}
		System.out.print("X");	// Just show "X" indicating the end of the list (null)
	}
	
	public static void getLinkedListFTSalary() {
		Scanner sc = null;
		FTList lst1= new FTList();
		
		try
		{
			sc = new Scanner(new FileInputStream("Full-Time-Faculty.txt")); // open the file to read
		}
		
		catch (FileNotFoundException a)
		{
			System.out.println("Could not open input file for reading. Please check if file exists.\nProgram will terminate.");
			System.exit(0);
		}
		
		while(sc.hasNextLine())
		{
		sc.nextLong();
		sc.next();
		sc.next();
		sc.next();
		sc.nextInt();
		lst1.addAtEnd(sc.nextInt());
		}
		lst1.showListContents();
		sc.close();
	}
	
	public static void findHighestSalary(FTList ft)
	{
		highest = 0;
		Node t = head;
		
		if(head==null)
		highest = 0;
		
		while(t!=null)
		{
			if (t.v > highest)
				highest = t.v;
			t = t.next;
		}
		findHighest=highest;
	}
	
	public static void findLowestSalary(FTList ft)
	{
		lowest = 1000000000;
		Node t = head;
		
		if(head==null)
		lowest = 0;
		
		while(t!=null)
		{
			if (t.v < lowest)
				lowest = t.v;
			t = t.next;
		}
		findLowest = lowest;
	}
	
	public static void findHighest_and_Lowest_FT_Salary()
	{
		ArrayList<FullTime> ftArr = new ArrayList<FullTime>(8);
		Scanner sc = null;		
		try
		{
			sc = new Scanner(new FileInputStream("Full-Time-Faculty.txt")); // open the file to read
		}
		catch (FileNotFoundException a)
		{
			System.out.println("Could not open input file for reading. Please check if file exists.\nProgram will terminate.");
			System.exit(0);
		}
		
		while(sc.hasNextLine())
		{
			FullTime f = new FullTime(sc.nextLong(),sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt());
			ftArr.add(f);
		}
		
		System.out.println("The fulltime's employee's highest salary is/are: ");
		for(int i = 0; i < ftArr.size(); i++)
		{
			FullTime c = ftArr.get(i);		// Get the element at index i
			if (c.getSalary()==findHighest)
			{
			System.out.println("\nInformation of Employee at index " + i + " is as follows: ");
			System.out.println("============================================ ");
			System.out.println(c);
			}
		}
		
		System.out.println("\nThe fulltime's employee's lowest salary is/are: ");
		for(int i = 0; i < ftArr.size(); i++)
		{
			FullTime c = ftArr.get(i);		// Get the element at index i
			if (c.getSalary()==findLowest)
			{
			System.out.println("\nInformation of Employee at index " + i + " is as follows: ");
			System.out.println("============================================ ");
			System.out.println(c);
			}
		}
	}
	
	public static void main(String[] args) {
		FTList ft = new FTList();
		FTList.getLinkedListFTSalary();
		System.out.println("\n");
		findHighestSalary(ft);
		findLowestSalary(ft);
		findHighest_and_Lowest_FT_Salary();
		
		// TODO Auto-generated method stub
	}
}
