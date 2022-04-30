package loop_example;

import java.util.Scanner;

public class Loop 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int number, positive = 0, negative = 0;
		int number_count = 0, positive_count = 0, negative_count = 0;
		double total = 0;
		double average = 0;
		
		for (int i=0; true; i++)
		{
			number = input.nextInt();
			if (number == 0)
				break;
			
			number_count++;
			
			if (number_count != 0)
			{
				total = total + number;
					
				if (number > 0)
				{
					positive = positive + number;
					positive_count++;
				}
				else 
				{
					negative = negative + number;
					negative_count++;
				}
		
				average = total / number_count;
			}
		}
		if(number_count != 0)
		{
			System.out.println("The number of positive is "+positive_count);
			System.out.println("The number of negative is "+negative_count);
			System.out.println("The total is "+total+"\nThe average is "+average);
		}
		else
			System.out.println("No numbers are Entered except 0");
	}

}
