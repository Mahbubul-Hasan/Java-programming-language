package void_Method;

public class Void_Method 
{

	public static void main(String[] args) 
	{
		grade(78.5);
		grade(59.5);
	}

	private static void grade(double grade) 
	{
		System.out.print("The grade is ");

		if (grade >= 90)
			System.out.println("A");
		else if (grade >= 80)
			System.out.println("B");
		else if (grade >= 70)
			System.out.println("C");
		else
			System.out.println("F");

	}

}
