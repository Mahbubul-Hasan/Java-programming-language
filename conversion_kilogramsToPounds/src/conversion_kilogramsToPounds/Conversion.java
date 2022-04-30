package conversion_kilogramsToPounds;

import java.util.Scanner;

public class Conversion
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int kilogram;
		double pound;
		System.out.println("Kilograms\tPound");
		for (int i=1; true; i++)
		{
			kilogram = input.nextInt();
			pound = kilogram * 2.2;
			System.out.printf("%d \t\t%.1f\n",kilogram,pound);
		}
	}

}
