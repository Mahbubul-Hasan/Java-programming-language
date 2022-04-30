package two_string_length;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first String");
		String string1 = input.nextLine();
		
		System.out.println("Enter second String");
		String string2 = input.nextLine();
		
		System.out.println("length of first string: "+string1.length());
		System.out.println("length of second string: "+string2.length());
	}
}
