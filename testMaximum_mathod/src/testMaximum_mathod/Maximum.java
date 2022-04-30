package testMaximum_mathod;

public class Maximum 
{
	public static void main(String[] args) 
	{
		int number1 = 5, number2 = 2;
		int result = maximum(number1,number2);
		
		System.out.println("The maximun of "+number1+" and "+number2+" is "+result);
	}

	private static int maximum(int number1, int number2) 
	{
		int result;
		if (number1 > number2)
			result = number1;
		else
			result = number2;
		return result;
	}
}
