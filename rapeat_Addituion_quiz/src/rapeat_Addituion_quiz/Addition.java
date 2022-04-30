package rapeat_Addituion_quiz;

import java.util.Scanner;

public class Addition 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		
		System.out.println("What is "+number1+" + "+number2+" ?");
		int real_answer = number1 + number2;
		int user_answer = input.nextInt();
		
		while (real_answer != user_answer) 
		{
			System.out.println("Wrong!!! Try again");
			user_answer = input.nextInt();
		}
		
		System.out.println("Right");
	}

}
