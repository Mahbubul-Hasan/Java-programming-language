package method_overLoading;

public class Method_overLoading 
{
	public static void main(String[] args) 
	{
		System.out.println("The maximun of 3 and 4 is "+Max(3, 4));
		
		System.out.println("TheThe maximun of 3.0 and 5.4 is "+Max(3.0, 5.4));
		
		System.out.println("TheThe maximun of 3.0, 5.4 and 10.14 is "+Max(3.0, 5.4, 10.14));
	}

	private static double Max(double number1, double number2, double number3) 
	{
		
		return Max(Max(number1, number2), number3);
	}

	private static double Max(double number1, double number2) 
	{
		if (number1 > number2)
			return number1;
		else
			return number2;
	}

	private static int Max(int number1, int number2) 
	{
		if (number1 > number2)
			return number1;
		else
			return number2;
	}

}
