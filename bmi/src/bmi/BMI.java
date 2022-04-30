package bmi;

import java.util.Scanner;

public class BMI 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ënter weight in pound : ");
		double pound = input.nextDouble();
		
		System.out.print("Ënter feet : ");
		double feet = input.nextDouble();
		
		System.out.print("Enter inches : ");
		double inches = input.nextDouble();
		
		double kg = pound * 0.4535;
		double feetToInches = feet * 12;
		double totalInches = feetToInches + inches;
		double hight = totalInches * 0.0254;
		double bmi = kg / (Math.pow(hight, 2));
		
		System.out.println("BMI is "+bmi);
		if (bmi <18.5)
		{
			System.out.println("Underweight");
		}
		else if (18.5 <= bmi && bmi <= 24.9)
		{
			System.out.println("Normal weight");
		}
		else if (25 <= bmi && bmi < 29.9)
		{
			System.out.println("Overweight ");
		}
		else if (bmi >= 30)
		{
			System.out.println("Obesity");
		}
	}

}
