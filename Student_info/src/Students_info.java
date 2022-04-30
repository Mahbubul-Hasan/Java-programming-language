
public class Students_info extends User
{
	String name;
	String id;
	double cgpa;
	Registration_info registration;
	
	public Students_info(String loginId, String password , String name , String id)
	{
		super(loginId, password);
		this.name = name;
		this.id = id;
	}
	
	public void setRegistration_info(Registration_info registration)
	{
		this.registration =  registration;
	}
	
	public void setCGPA(double cgpa)
	{
		this.cgpa = cgpa;
	}
	
	public void display()
	{
		System.out.println("Student Dfetails: ");
		System.out.println("Name : " +name+ "\nID : " +id+ "\nCGPA : "+cgpa);
		registration.display();
	}
}
