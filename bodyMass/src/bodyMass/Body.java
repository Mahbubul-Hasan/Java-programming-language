package bodyMass;

import java.util.Scanner;

public class Body 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter weight in pound : ");
		double pound = input.nextDouble();
		
		System.out.printf("Enter height in inches : ");
		double height = input.nextDouble();
		
		double kilogram = pound * 0.45359237;
		double meter = height * 0.0254;
		double bmi = kilogram / (Math.pow(meter, 2));
		System.out.println("BMI is "+bmi);
		
		if (bmi < 18.5)
		{
			System.out.println("Underweight");
		}
		
		else if (18.5 <= bmi && bmi <25.0)
		{
			System.out.println("Normal");
		}
		
		else if (25.0 <= bmi && bmi <30.0)
		{
			System.out.println("Overweight");
		}
		
		else if (30.0 <= bmi)
		{
			System.out.println("Obese");
		}
	}

}
