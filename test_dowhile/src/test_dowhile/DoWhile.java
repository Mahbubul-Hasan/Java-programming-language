package test_dowhile;

import java.util.Scanner;

public class DoWhile 
{
	public static void main(String[] args)
	{
		int number;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		do 
		{
			System.out.print("Enter an interger (the input ends if is 0) : ");
			number = input.nextInt();
			sum += number;
		} while (number != 0);
		
		System.out.println("The sum is "+sum);
	}

}
