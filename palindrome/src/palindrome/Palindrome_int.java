package palindrome;

import java.util.Scanner;

public class Palindrome_int 
{

	public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int InputNumber = input.nextInt();
		
		int reverse = 0, remainder;
		
		int number = InputNumber;
		for(int i=0; InputNumber !=0; i++) {
			remainder = InputNumber % 10;
			reverse = reverse * 10 + remainder;
			InputNumber = InputNumber / 10;
		}
		
		if (number == reverse) 
			System.out.println("This number is a palindrome");
		else
			System.out.println("This number is not a palindrome");
	}

}
