package sum_for_loop;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int number, sum = 0, count;
		
		for (count = 0; count<5; count++)
		{
			number = input.nextInt();
			sum += number;
		}
		
		System.out.println("Sum is "+sum);
		System.out.println("Count is "+count);
	}
}
