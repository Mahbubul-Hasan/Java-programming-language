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
		
		System.out.println("String 1: "+string1);
		System.out.println("String 2: "+string2);
		
		String concate = string1+" "+string2;
		System.out.println("Concate String: "+concate);
		System.out.println("Concatenate string length: "+concate.length());
		
		System.out.println("Split string: ");
		String array[] = concate.split(" ");
		for (String a: array) {
			System.out.println(a);
		}
	}
}
