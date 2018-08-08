// -----------------------------------------------------
// Assignment #4
//
// Written by: Alexandre Kang, 40027204
// -----------------------------------------------------

package package1;

public class PartTime extends Employees{
	private double hourlyRate;
	private int numberOfHoursOfCurrentTerm;
	private int numberOfStudentInClass;	
	
	public PartTime()
	{
		super();
		hourlyRate = 0.0;
		numberOfHoursOfCurrentTerm = 0;
		numberOfStudentInClass = 0;
	}
	
	public PartTime(long i, String fiName, String faName, String c, int y, double r, int h, int s)
	{
		super(i, fiName, faName, c, y);
		hourlyRate = r;
		numberOfHoursOfCurrentTerm = h;
		numberOfStudentInClass = s;
	}
	
	public PartTime(PartTime p)
	{
		setId(p.getId());
		setFirstName(p.getFirstName());
		setFamilyName(p.getFamilyName());
		setCity(p.getCity());
		setHireYear(p.getHireYear());
		setHourlyRate(p.hourlyRate);
		setNumberOfHoursOfCurrentTerm(p.numberOfHoursOfCurrentTerm);
		setNumberOfStudentInClass(p.numberOfStudentInClass);	
	}
	
	public double getHourlyRate()
	{
		return hourlyRate;
	}
	
	public void setHourlyRate(double r)
	{
		hourlyRate = r;
	}
	
	public int getNumberOfHoursOfCurrentTerm()
	{
		return numberOfHoursOfCurrentTerm;
	}
	
	public void setNumberOfHoursOfCurrentTerm(int h)
	{
		numberOfHoursOfCurrentTerm = h;
	}
	
	public int getNumberOfStudentInClass()
	{
		return numberOfStudentInClass;
	}
	
	public void setNumberOfStudentInClass(int s)
	{
		numberOfStudentInClass = s;
	}
	
	public String toString()
	{
		return super.toString() + "\nHourly rate: " + getHourlyRate() +
				"\nNumber Of Hours Of Current Term: " + getNumberOfHoursOfCurrentTerm() +
				"\nNumber Of Student In Class: " + getNumberOfStudentInClass();
	}
}
