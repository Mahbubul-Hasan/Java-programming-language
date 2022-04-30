
public class Registration_info 
{
	String semester;
	int year;
	String courseCode[] = new String[3];
	String section[] = new String[3];
	int code,sec;
	public Registration_info(String semester , int year)
	{
		this.semester = semester;
		this.year = year;
	}
	
	public void setCourse_Section(String courseCode , String section)
	{
		this.courseCode[code++] = courseCode;
		this.section[sec++] = section;
	}
	public void display()
	{
		System.out.println("\nRegistration Details :");
		System.out.println("Semester : " +semester+ "\nYear : " +year);
		for (int i=0; i<courseCode.length; i++)
		{
			System.out.println("Course Code: " +courseCode[i]+ "\tSection : "+section[i]);
		}
		System.out.println();
	}
}
