package greatest_common_divisor;

import java.util.Scanner;

public class Greatest_common_divisor 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer : ");
		int number1 =input.nextInt();
		System.out.print("Enter second integer : ");
		int number2 = input.nextInt();
		int flag = 0;
		
		for (int i=2; i<100; i++)
		{
			if (number1 % i == 0 && number2 % i == 0)
			{
				flag = i;
			}
		}
		
		System.out.println("The greatest common divisor for "+number1+" and "+number2+" is "+flag);
	}
}
