import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String string = input.nextLine();
		System.out.println("Original string: "+string);
		
		String removeSpace = string.replace(" ", "");
		System.out.println("Remove Space: "+removeSpace);
	}
}
