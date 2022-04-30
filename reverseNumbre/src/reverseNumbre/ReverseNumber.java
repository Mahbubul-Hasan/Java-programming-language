package reverseNumbre;

import java.util.Scanner;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = input.nextInt();
		int reminder = 0;
		int reverse = 0;
		System.out.print("Reverse number : ");
		while(number != 0)
		{
			reminder = number % 10;
			System.out.print(reminder);
			//reverse = reverse * 10 + reminder;
			number = number / 10;
			
		}
		//System.out.println(reverse);
	}

}
