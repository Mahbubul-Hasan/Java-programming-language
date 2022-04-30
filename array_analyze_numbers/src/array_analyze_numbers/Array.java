package array_analyze_numbers;

import java.util.Scanner;

public class Array 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of item: ");
		int size = input.nextInt();
		
		System.out.print("Enter the numbers: ");
		double array[] = new double[size];
		
		for (int i=0; i<array.length; i++)
			array[i] = input.nextDouble();
		
		double sum = 0, average = 1;
		for(int i=0; i<array.length; i++)
		{
			sum = sum + array[i];
			average = sum / array.length;
		}
		System.out.println("average is "+average);
		
		int flag = 0;
		for(int i=0; i<array.length; i++)
		{
			if (array[i] > average)
				flag++;
		}
		System.out.println("Number of elements above the average is "+flag);
	}
}
