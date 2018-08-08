// -----------------------------------------------------
// Assignment #4
//
// Written by: Alexandre Kang, 40027204
// -----------------------------------------------------

package package1;

public class Staff extends Employees{
	private double salary;
	private char performanceCode;
	
	public Staff()
	{
		super();
		salary = 0;
		performanceCode = 'C';
	}
	
	public Staff(long i, String fiName, String faName, String c, int y, double s, char p)
	{
		super(i, fiName, faName, c, y);
		salary = s;
		performanceCode = p;
	}
	
	public Staff(Staff s)
	{
		setId(s.getId());
		setFirstName(s.getFirstName());
		setFamilyName(s.getFamilyName());
		setCity(s.getCity());
		setHireYear(s.getHireYear());
		setSalary(s.salary);
		setPerformanceCode(s.performanceCode);
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double s)
	{
		 salary = s;
	}
	
	public char getPerformanceCode()
	{
		return performanceCode;
	}
	
	public void setPerformanceCode(char p)
	{
		 performanceCode = p;
	}
	
	public String toString()
	{
		return super.toString() + "\nSalary: " + getSalary() +
				"\nPerformance Code: " + getPerformanceCode();
	}

}
