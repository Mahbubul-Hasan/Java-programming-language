

public class ThisKey 
{
	int age = 19;
	public void student()
	{
		System.out.println("Student1 age is "+age);
		this.student(20);
	}
	public void student(int age)
	{
		System.out.println("Student2 age is "+age);
	}
}
