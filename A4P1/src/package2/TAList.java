// -----------------------------------------------------
// Assignment #4
//
// Written by: Alexandre Kang, 40027204
// -----------------------------------------------------

package package2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TAList {
	private static final double UD_TA_rate = 18.25;
	private static final double GD_TA_rate = 1.2*UD_TA_rate;

	private class Node
	{
		private double v;
		private Node next;	// A link to the next node, which is of type Node1
		
		// Default constructors 
		public Node()
		{
			v = 0;
			next = null;
		}
		
		// Parameterized constructor 
		public Node(double i, Node xt)
		{
			v = i;
			next = xt;
		}
		
	} // end of inner class Node
	
	private static Node head;
	
	public TAList()
	{
		head = null;
	}
	
	public void addAtEnd(double i)
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
			System.out.print(temp.v + " ---> "); // math round
			temp = temp.next;		// Move to the next node
		}
		System.out.print("X");	// Just show "X" indicating the end of the list (null)
	}
	
	public static void getLinkedListTA(){
		Scanner sc = null;
		TAList lst1= new TAList();
		
		try
		{
			sc = new Scanner(new FileInputStream("TAs.txt")); // open the file to read
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
		String s = sc.next();
		if (s.equals("UGrad"))
		{
			sc.nextInt();
			lst1.addAtEnd(UD_TA_rate*sc.nextInt());
			sc.nextLine();
		}
		else if(s.equals("Grad"))
		{
			sc.nextInt();
			lst1.addAtEnd(GD_TA_rate*sc.nextInt());
		}
		else sc.nextLine();
		}
		lst1.showListContents();
		sc.close();
	}
	
	public static double getSalaryTAList(TAList ta)
	{
		Node t = head;
		double salaryTAList = 0.0;
		
		if (head == null)
			salaryTAList = 0.0;

		while(t!=null)
		{
			salaryTAList = salaryTAList + t.v;
			t = t.next;
		}
		return salaryTAList;
	}

}