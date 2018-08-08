// -----------------------------------------------------
// Assignment #4
//
// Written by: Alexandre Kang, 40027204
// -----------------------------------------------------

package package1;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Driver {
	private static Scanner kb = new Scanner (System.in);

	public static void main(String[] args) {	
		addFTRecords();
		addPTRecords();
		addTARecords();
		// TODO Auto-generated method stub
	}

	public static void addFTRecords()
	{
		ArrayList<Long> idArr = new ArrayList<Long>(8);
		Scanner sc = null;
		PrintWriter pw = null;
		long id = 0; // is to check the user's input (see line 46)
		
		try
		{
			pw = new PrintWriter(new FileOutputStream ("Full-Time-Faculty.txt",true)); // open the file to write
			pw.println();
			sc = new Scanner(new FileInputStream("Full-Time-Faculty.txt")); // open the file to read
		}
		catch (FileNotFoundException a)
		{
			System.out.println("Could not open input/output file for writing/reading. Please check if file exists.\nProgram will terminate.");
			System.exit(0);
		}
		
		while(sc.hasNextLine())
		{
			idArr.add(sc.nextLong()); // add all the Long data (in the "Full-Time-Faculty.txt" file) in the arraylist idArr
			sc.nextLine(); // because cursor will be at the end of the long, but does not skip the line after reading the long 
		}
		
		System.out.print("ID (Enter -1 to terminate the adding of full-time employees): ");
		id = kb.nextLong();
			
		while(id!=-1 || id > 0) // until id == -1, add the id in the file "Full-Time-Faculty.txt"
		{
		while (idArr.contains(id))
		{
			System.out.print("ID already registered in the file \"Full-Time-Faculty.txt\". Please enter another ID: ");
			id = kb.nextLong();
			if(id==-1)
			{
				System.out.print("Adding full-time employee terminate.");
				pw.close();
				sc.close();
				System.exit(0);
			}
		}
		idArr.add(id);

		System.out.println("Enter data for the new full-time employee:\n");
				
		String firstName = "";
		String familyName = "";
		String city = ""; 
		int hireYear = 0;
		int salary = 0;
			
				try
				{
					System.out.print("First Name: ");
					firstName = kb.next();
						
					System.out.print("Family Name: ");
					familyName = kb.next();
						
					System.out.print("City of Residence: ");
					city = kb.next();
						
					System.out.print("Hire Year: ");
					hireYear = kb.nextInt();
						
					System.out.print("Salary: ");
					salary = kb.nextInt();
					
					pw.print(id + " " + firstName + "\t" + familyName + "\t\t" + city + "\t\t" + hireYear + "\t" + salary + "\n");
					// write the new full-time employee in the "Full-Time-Faculty.txt" file
				}
				
				catch (InputMismatchException c)
				{
					System.out.print("You entered an invalid character. Quitting!");
					System.exit(0);
				}
				
				System.out.println("ID (Enter -1 to terminate the adding of full-time employees): ");
				id = kb.nextLong();
			}
		sc.close();
		pw.close();	
	}
	
	public static void addPTRecords()
	{

		ArrayList<Long> idArr = new ArrayList<Long>(8);
		Scanner sc = null;
		PrintWriter pw = null;
		long id = 0; // is to check the user's input (see line 131)
		
		try
		{
			pw = new PrintWriter(new FileOutputStream ("Part-Time-Faculty.txt",true)); // open the file to write
			pw.println();
			sc = new Scanner(new FileInputStream("Part-Time-Faculty.txt")); // open the file to read
		}
		catch (FileNotFoundException a)
		{
			System.out.println("Could not open input/output file for writing/reading. Please check if file exists.\nProgram will terminate.");
			System.exit(0);
		}
		
		while(sc.hasNextLine())
		{
			idArr.add(sc.nextLong()); // add all the Long data (in the "Part-Time-Faculty.txt" file) in the arraylist idArr
			sc.nextLine(); // because cursor will be at the end of the long, but does not skip the line after reading the long 
		}
		
		System.out.print("ID (Enter -1 to terminate the adding of part-time employees): ");
		id = kb.nextLong();
			
		while(id!=-1 || id > 0) // until id == -1, add the id in the file "Part-Time-Faculty.txt"
		{
		while (idArr.contains(id))
		{
			System.out.print("ID already registered in the file \"Part-Time-Faculty.txt\". Please enter another ID: ");
			id = kb.nextLong();
			if(id==-1)
			{
				System.out.print("Adding part-time employee terminate.");
				pw.close();
				sc.close();
				System.exit(0);
			}
		}
		idArr.add(id);

		System.out.println("Enter data for the new part-time employee:\n");
				
		String firstName = "";
		String familyName = "";
		String city = ""; 
		int hireYear = 0;
		double hourlyRate = 0.0;
		int numberOfHoursOfCurrentTerm = 0;
		int numberOfStudentInClass = 0;
			
				try
				{
					System.out.print("First Name: ");
					firstName = kb.next();
						
					System.out.print("Family Name: ");
					familyName = kb.next();
						
					System.out.print("City of Residence: ");
					city = kb.next();
						
					System.out.print("Hire Year: ");
					hireYear = kb.nextInt();
						
					System.out.print("Hourly Rate: ");
					hourlyRate = kb.nextDouble();
					
					System.out.print("Number of Hours of Current Term: ");
					numberOfHoursOfCurrentTerm = kb.nextInt();
					
					System.out.print("Number of Student In Class: ");
					numberOfStudentInClass = kb.nextInt();
					
					pw.print(id + " " + firstName + "\t" + familyName + "\t\t" + 
					city + "\t\t" + hireYear + "\t" + hourlyRate + "\t"+ 
					numberOfHoursOfCurrentTerm + "\t"+ numberOfStudentInClass + "\n");
					// write the new part-time employee in the "Full-Time-Faculty.txt" file
				}
				
				catch (InputMismatchException c)
				{
					System.out.print("You entered an invalid character. Quitting!");
					System.exit(0);
				}
				
				System.out.println("ID (Enter -1 to terminate the adding of part-time employees): ");
				id = kb.nextLong();
			}
		sc.close();
		pw.close();	
	}
	
	public static void addTARecords()
	{

		ArrayList<Long> idArr = new ArrayList<Long>(8);
		Scanner sc = null;
		PrintWriter pw = null;
		long id = 0; // is to check the user's input (see line 230)
		
		try
		{
			pw = new PrintWriter(new FileOutputStream ("TAs.txt",true)); // open the file to write
			pw.println();
			sc = new Scanner(new FileInputStream("TAs.txt")); // open the file to read
		}
		catch (FileNotFoundException a)
		{
			System.out.println("Could not open input/output file for writing/reading. Please check if file exists.\nProgram will terminate.");
			System.exit(0);
		}
		
		while(sc.hasNextLine())
		{
			idArr.add(sc.nextLong()); // add all the Long data (in the "TAs.txt" file) in the arraylist idArr
			sc.nextLine(); // because cursor will be at the end of the long, but does not skip the line after reading the long 
		}
		
		System.out.print("ID (Enter -1 to terminate the adding of TA employees): ");
		id = kb.nextLong();
			
		while(id!=-1 || id > 0) // until id == -1, add the id in the file "TAs.txt"
		{
		while (idArr.contains(id))
		{
			System.out.print("ID already registered in the file \"TAs.txt\". Please enter another ID: ");
			id = kb.nextLong();
			if(id==-1)
			{
				System.out.print("Adding TA employee terminate.");
				pw.close();
				sc.close();
				System.exit(0);
			}
		}
		idArr.add(id);

		System.out.println("Enter data for the new TA employee:\n");
				
		String firstName = "";
		String familyName = "";
		String city = ""; 
		int hireYear = 0;
		String classification = "";
		int numberOfClasses = 0;
		int totalNumberOfWorkingHours = 0;
			
				try
				{
					System.out.print("First Name: ");
					firstName = kb.next();
						
					System.out.print("Family Name: ");
					familyName = kb.next();
						
					System.out.print("City of Residence: ");
					city = kb.next();
						
					System.out.print("Hire Year: ");
					hireYear = kb.nextInt();
						
					System.out.print("Classification: ");
					classification = kb.next();
					
					System.out.print("Number of Classes: ");
					numberOfClasses = kb.nextInt();
					
					System.out.print("Total Number of Working Hours: ");
					totalNumberOfWorkingHours = kb.nextInt();
					
					pw.print(id + " " + firstName + "\t" + familyName + "\t\t" + 
					city + "\t\t" + hireYear + "\t" + classification + "\t" + 
					numberOfClasses + "\t"+ totalNumberOfWorkingHours + "\n");
					// write the new TA employee in the "TAs.txt" file
				}
				
				catch (InputMismatchException c)
				{
					System.out.print("You entered an invalid character. Quitting!");
					System.exit(0);
				}
				
				System.out.println("ID (Enter -1 to terminate the adding of TA employees): ");
				id = kb.nextLong();
			}
		sc.close();
		pw.close();	
	}
}