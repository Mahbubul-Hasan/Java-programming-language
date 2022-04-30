import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter number 2: ");
		int number2 = input.nextInt();
		
		System.out.println("Add: "+(number1 + number2));
		System.out.println("Sub: "+(number1 - number2));
		System.out.println("Mul: "+(number1 * number2));
		System.out.println("Div: "+((double)number1 / (double)number2));
		

	}
}