package quadraticEquation;

import java.util.Scanner;

public class QuadraticEquation 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double result1 = ((-b + (Math.sqrt((Math.pow(b, 2)) - 4*a*c))) / 2*a );
		double result2 = ((-b - (Math.sqrt((Math.pow(b, 2)) - 4*a*c))) / 2*a );
		if (result1 > 0 && result2 > 0)
		{
			System.out.println("The equation has two roots "+result1+ " and " +result2);
		}
		
		else if (result1 == 0 && result2 == 0)
		{
			System.out.println("The equation has one roots "+result1+ " and " +result2);
		}
		
		else 
		{
			System.out.println("The equation has no real roots");
		}
	}

}
