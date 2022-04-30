package palindrome;

import java.util.Scanner;

public class Palindome_string 
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
		if (string.equals(reverse))
			System.out.println(string+" is palindrome");
		else
			System.out.println(string+" is not palindrome");
	}
}
