package reverse_numbers;

import java.util.Scanner;

public class Reverse_string 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = input.nextLine();
		String reverse = "";
		for(int i = string.length() - 1; i>=0; i--)
		{
			reverse = reverse + string.charAt(i);
		}
		System.out.println(string+"'s reverse is "+reverse);
	}

}
