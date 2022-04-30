package greatest_commone_divisor_method;

import java.util.Scanner;

public class Greatest_commone_divisor_method 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();
		
		System.out.println("The greatest common divisor for "+number1+" and "+number2+" is "+gcd(number1, number2));
	}

	private static int gcd(int number1, int number2) 
	{
		int flag = 0;
		for (int i=1; i<100; i++)
		{
			if (number1 % i == 0 && number2 % i == 0)
			{
				flag = i;
			}
		}
		return flag;
	}

}
