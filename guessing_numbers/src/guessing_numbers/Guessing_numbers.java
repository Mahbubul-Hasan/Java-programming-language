package guessing_numbers;

import java.util.Scanner;

public class Guessing_numbers 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<100; i++)
		{
			int number = (int)(Math.random()*10);
			System.out.print("Enter your guess ");
			int user_input = input.nextInt();
			
			if (user_input > number)
			{
				System.out.println("Your guss is too high");
			}
			
			else if (user_input < number)
			{
				System.out.println("Your guss is too low");
			}
			
			else
			{
				System.out.println("Yes, the number is "+number);
				break;
			}
		}
	}
}
