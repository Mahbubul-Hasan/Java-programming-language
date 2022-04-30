import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String string = input.nextLine();
		System.out.println("Original string: "+string);
		
		System.out.println("Split string: ");
		String array[] = string.split(" ");
		for (String a: array) {
			System.out.println(a);
		}
	}
}
