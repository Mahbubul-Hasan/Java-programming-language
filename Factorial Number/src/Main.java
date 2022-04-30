import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = input.nextInt();
		int Factorial = 1;
		for (int i = 1; i <= number; i++) {
			Factorial = Factorial * i;
		}
		
		System.out.println(Factorial);
	}
}
