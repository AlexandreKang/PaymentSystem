// -----------------------------------------------------
// Assignment #4
//
// Written by: Alexandre Kang, 40027204
// -----------------------------------------------------

package package1;

public class FullTime extends Employees{
	private int salary;
	
	public FullTime()
	{
		super();
		salary = 0;
	}
	
	public FullTime(long i, String fiName, String faName, String c, int y, int s)
	{
		super(i, fiName, faName, c, y);
		salary = s;
	}
	
	public FullTime(FullTime f)
	{
		setId(f.getId());
		setFirstName(f.getFirstName());
		setFamilyName(f.getFamilyName());
		setCity(f.getCity());
		setHireYear(f.getHireYear());
		setSalary(f.salary);
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public void setSalary(int s)
	{
		 salary = s;
	}
	
	public String toString()
	{
		return super.toString() + "\nSalary: " + getSalary(); 	
	}
}
