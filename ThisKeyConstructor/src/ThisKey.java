
public class ThisKey 
{
	int age = 20;
	public ThisKey()
	{
		this(21);
		System.out.println("Student1 age is "+age);
		//this(21);
	}
	public ThisKey(int age)
	{
		this.age = age;
		System.out.println("Student2 age is "+age);
	}
}
