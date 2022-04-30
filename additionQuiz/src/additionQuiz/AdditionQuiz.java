package additionQuiz;

import java.time.format.ResolverStyle;
import java.util.Scanner;

public class AdditionQuiz
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int remainder = 0;
		int reverse = 0;
		int number1 = (int)(Math.random()*10);
		System.out.println("Number1 : "+number1);
		
		int number2 = (int)(Math.random()*10);
		System.out.println("Number2 : "+number2);
		
		int realAns = number1 + number2;
		
		System.out.print("Enter the sum of "+number1+" & " +number2+ " : ");
		int userAns = input.nextInt();
		
		if (realAns == userAns)
		{
			while(userAns != 0)
				{
					remainder = userAns % 10;
					reverse = reverse * 10 + remainder;
					userAns = userAns / 10;
				}
			System.out.print("reverse number of "+realAns+" is : "+reverse);
			
			int finalSum = number1 + number2 + reverse;
			 System.out.println("\nSum of this three number is : "+finalSum);
		}
		
		else 
		{
			System.out.println("Please enter wright inpute");
		}
	}

}
