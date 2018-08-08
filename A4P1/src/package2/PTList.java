// -----------------------------------------------------
// Assignment #4
//
// Written by: Alexandre Kang, 40027204
// -----------------------------------------------------

package package2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PTList {
	
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
	
	public PTList()
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
			System.out.print(Math.round(temp.v*100.0)/100.0 + " ---> ");
			temp = temp.next;		// Move to the next node
		}
		System.out.print("X");	// Just show "X" indicating the end of the list (null)
	}

	public static void getLinkedListPT() {
		Scanner sc = null;
		PTList lst1= new PTList();
		
		try
		{
			sc = new Scanner(new FileInputStream("Part-Time-Faculty.txt")); // open the file to read
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
		double x = Math.round(sc.nextDouble()*sc.nextInt()*100.0)/100.0;
		lst1.addAtEnd(x);
		sc.nextLine();
		}
		lst1.showListContents();
		sc.close();
	}
	
	public static double getSalaryPTList(PTList pt)
	{
		Node t = head;
		double salaryPTList = 0.0;
		
		if (head == null)
			salaryPTList = 0.0;

		while(t!=null)
		{
			salaryPTList = salaryPTList + t.v;
			t = t.next;
		}
		return salaryPTList;
	}
	
	public static void findTermSalary(PTList pt, TAList ta)
	{
		System.out.print("The term salary is " + (PTList.getSalaryPTList(pt) + TAList.getSalaryTAList(ta)) + ".");
	}
	
	public static void main(String[] args) {	

		PTList pt = new PTList();
		PTList.getLinkedListPT();
		System.out.println("\n");
		TAList ta = new TAList();
		TAList.getLinkedListTA();
//		System.out.println("\n");
//		PTList.getSalaryPTList(pt);
//		System.out.println("\n");
//		TAList.getSalaryTAList(ta);
		System.out.println("\n");
		findTermSalary(pt, ta);
		// TODO Auto-generated method stub
	}
}
