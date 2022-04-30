package reverse_numbers;

import java.util.Scanner;

public class Reverse_int 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();
		int remainder, reverse = 0;
		System.out.print(number+"'s reverse is ");
		for(int i=0; number!=0; i++)
		{
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println(reverse);
	}

}
