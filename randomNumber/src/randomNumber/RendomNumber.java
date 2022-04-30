package randomNumber;

import java.util.Scanner;

public class RendomNumber 
{

	public static void main(String[] args) 
	{
		int num1 = (int) (Math.random()*10);
		int num2 = (int) (Math.random()*10);
		Scanner inpute = new Scanner(System.in);
		System.out.println("What is "+num1+" + "+num2+ " ?");
		int answer = inpute.nextInt();
		System.out.println(num1+" + "+num2+" = " +(num1+num2)+" is "+(num1+num2 == answer));
	}

}
