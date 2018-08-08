// -----------------------------------------------------
// Assignment #4
//
// Written by: Alexandre Kang, 40027204
// -----------------------------------------------------

package package1;

public abstract class Employees implements Ordered{
	private long id;
	private String firstName;
	private String familyName;
	private String city; 
	private int hireYear;
	
	public Employees()
	{
		 id = 0;
		 firstName = "";
		 familyName = "";
		 city = ""; 
		 hireYear = 0;
	}
	
	public Employees(long i, String fiName, String faName, String c, int y)
	{
		 id = i;
		 firstName = fiName;
		 familyName = faName;
		 city = c; 
		 hireYear = y;
	}
	
	public Employees(Employees e)
	{
		 id = e.getId();
		 firstName = e.getFirstName();
		 familyName = e.getFamilyName();
		 city = e.getCity(); 
		 hireYear = e.getHireYear();
	}
	
	public long getId()
	{
		return id;
	}
	
	public void setId(long i)
	{
		 id = i;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String fiName)
	{
		 firstName = fiName;
	}
	
	public String getFamilyName()
	{
		return familyName;
	}
	
	public void setFamilyName(String faName)
	{
		 familyName = faName;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String c)
	{
		 city = c;
	}
	
	public int getHireYear()
	{
		return hireYear;
	}
	
	public void setHireYear(int y)
	{
		 hireYear = y;
	}
	
	public String toString()
	{
		return "ID: " + getId() + "\nFirst name: " + getFirstName() +
				"\nFamily name: " + getFamilyName() + "\nCity: " +
				getCity() + "\nHire year: " + getHireYear();
		
	}
	
	public boolean precedes(Object e)
	{
		if (e == null)
			return false;
		else if (!(e instanceof Employees)) // check if e is an employee
			return false;
		else
			{
			Employees x = (Employees) e; // cast
			return (this.getHireYear() < x.getHireYear());
			}
	}
	
	public boolean follows(Object e)
	{
		if (e == null)
			return false;
		else if (!(e instanceof Employees)) // check if e is an employee
			return false;
		else
			{
			Employees x = (Employees) e; // cast
			return (this.getHireYear() > x.getHireYear());
			}
	}
}
