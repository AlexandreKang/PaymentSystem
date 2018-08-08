// -----------------------------------------------------
// Assignment #4
//
// Written by: Alexandre Kang, 40027204
// -----------------------------------------------------

package package1;

public class Students extends Employees{
	public static enum status {undergraduate, graduate, alumni}; 
	private status classification;
	private double rate;
	private final double UD_TA_rate = 18.25;
	private final double GD_TA_rate = 1.2*UD_TA_rate;
	private int numberOfClasses;
	private int totalNumberOfWorkingHours;
	
	public Students()
	{
		super();
		classification = status.undergraduate;
		rate = UD_TA_rate;
		numberOfClasses = 0;
		totalNumberOfWorkingHours = 0;
	}
	
	public Students(long i, String fiName, String faName, String c, int y, status ta, int cl, int w)
	{
		super(i,fiName,faName,c,y);
		if (ta==status.undergraduate)
		{
			this.classification = status.undergraduate;
			rate = UD_TA_rate;
		}
		if (ta==status.graduate)
		{
			this.classification = status.graduate;
			rate = GD_TA_rate;
		}
		if (ta!=(status.undergraduate) || (ta!=status.graduate))
		{
			System.out.print("Error");
		}
		numberOfClasses = cl;
		totalNumberOfWorkingHours = w;
	}
	
	public Students(Students s)
	{
		setId(s.getId());
		setFirstName(s.getFirstName());
		setFamilyName(s.getFamilyName());
		setCity(s.getCity());
		setHireYear(s.getHireYear());
		if (s.getClassification()==status.undergraduate)
		{
			s.classification = status.undergraduate;
			rate = UD_TA_rate;
		}
		if (s.getClassification()==status.graduate)
		{
			s.classification = status.graduate;
			rate = GD_TA_rate;
		}
		if (s.getClassification()!=(status.undergraduate) || (s.getClassification()!=status.graduate))
		{
			System.out.print("Error");
		}
		numberOfClasses = s.numberOfClasses;
		totalNumberOfWorkingHours = s.totalNumberOfWorkingHours;
	}
	
	public status getClassification() {
		return classification;
	}

	public void setSt(status ta) {
		if (ta==status.undergraduate)
		{
			this.classification = status.undergraduate;
			rate = UD_TA_rate;
		}
		if (ta==status.graduate)
		{
			this.classification = status.graduate;
			rate = GD_TA_rate;
		}
		if (ta!=(status.undergraduate) || (ta!=status.graduate))
		{
			System.out.print("Error");
		}
	}
	
	public int getNumberOfClasses() {
		return numberOfClasses;
	}

	public void setNumberOfClasses(int c) {
		this.numberOfClasses = c;
	}
	
	public int getTotalNumberOfWorkingHours() {
		return totalNumberOfWorkingHours;
	}

	public void setTotalNumberOfWorkingHours(int w) {
		this.totalNumberOfWorkingHours = w;
	}
	
	public String toString()
	{
		return super.toString() + "\nClassification: " + getClassification() +
				"\nNumber Of Classes: " + getNumberOfClasses() +
				"\nNumber Of Working Hours: " + getTotalNumberOfWorkingHours();
	}

}
