// -----------------------------------------------------
// Assignment #4
//
// Written by: Alexandre Kang, 40027204
// -----------------------------------------------------

package package2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class StaffList {

	private static int salary;
	
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

	public StaffList()
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
	
	public static void getLinkedListStaffSalary() {
		Scanner sc = null;
		StaffList lst1= new StaffList();
		
		try
		{
			sc = new Scanner(new FileInputStream("Staff.txt")); // open the file to read
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
		sc.nextLine();
		}
		lst1.showListContents();
		sc.close();
	}

	public static void Increase_Staff_Salary()
	{
		Node t = head;
		Scanner sc = null;
		PrintWriter pw = null;
		
		try
		{
			sc = new Scanner(new FileInputStream("Staff.txt")); // open the file to read
			pw = new PrintWriter(new FileOutputStream("s.txt")); // open the file to write
		}
		
		catch (FileNotFoundException b)
		{
			System.out.println("Could not open input file for reading/writing. Please check if file exists.\nProgram will terminate.");
			System.exit(0);
		}
		
		while (sc.hasNextLine())
		{
			if (head == null)
				salary = 0;
			else
			{
				salary = t.v;
				t=t.next;
			}
			Long l = sc.nextLong();
			String s = sc.next();
			String x = sc.next();
			String z = sc.next();
			int i = sc.nextInt();
			
			pw.print(l + "\t");
			pw.print(s + "\t");
			pw.print(x + "\t");
			pw.print(z + "\t");
			pw.print(i + "\t");
			sc.nextInt();
			char p = sc.next().charAt(0);
			if (p =='A')
			{
				pw.print(salary*1.08 + "\t");
			}
			if (p =='B')
			{
				pw.print(salary*1.06 + "\t");
			}
			if (p =='C')
			{
				pw.print(salary*1.03 + "\t");
			}
			if (p =='D')
			{
				pw.print(salary*1.01 + "\t");
			}
			pw.print('E');
			pw.print("\n");
		}
		sc.close();
		pw.close();
		
		try
		{
			sc = new Scanner(new FileInputStream("s.txt")); // open the file to read
			pw = new PrintWriter(new FileOutputStream("Staff.txt")); // open the file to write

		}
		
		catch (FileNotFoundException a)
		{
			System.out.println("Could not open input file for reading/writing. Please check if file exists.\nProgram will terminate.");
			System.exit(0);
		}		
		
		{
			// Read line by line from input file and copy it to output file
			String s;
			
			while(sc.hasNextLine())
			{
				s = sc.nextLine();		
				pw.println(s);
				
			}
			// Must close the files to flush the buffers
			sc.close();
			pw.close();
		}
		
			File f = new File("/Users/AMK/Documents/workspace/A4P1/s.txt"); // delete the intermediate file
		    f.delete();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getLinkedListStaffSalary();
		Increase_Staff_Salary();

	}

}
