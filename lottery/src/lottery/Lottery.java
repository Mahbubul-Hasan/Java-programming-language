package lottery;

import java.util.Scanner;
import java.util.concurrent.Exchanger;
import java.util.regex.Matcher;

public class Lottery 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter your lottery pick (teo digits) : ");
		int yourKey = input.nextInt();
		
		int lotteryNumber = (int)(Math.random()*100);
		System.out.printf("The lottery number is : %d\n",lotteryNumber);
		
		int yourKey1 = yourKey / 10;
		int yourKey2 = yourKey % 10;
		
		int lotteryNumber1 = lotteryNumber / 10;
		int lotteryNumber2 = lotteryNumber % 10;
		
		if (yourKey == lotteryNumber)
		{
			System.out.println("Exact match: you win $ 10,000");
		}
		
		else if (yourKey1 == lotteryNumber2 && yourKey2 == lotteryNumber1)
		{
			System.out.println("Match all digits: you win $3,000");
		}
		
		else if (yourKey1==lotteryNumber1 || yourKey1==lotteryNumber2 || yourKey2==lotteryNumber1 || yourKey2==lotteryNumber2)
		{
			System.out.println("Match one digit: you win $1,000");
		}
		
		else {
			{
				System.out.println("Sorry: no match");
			}
		}
	}

}
