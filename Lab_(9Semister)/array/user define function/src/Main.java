import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 1st number ");
		int number1 = input.nextInt();
		
		System.out.print ("Enter 2nd number ");
		int number2 = input.nextInt();
		
		System.out.print("What oparetion do you want to exeicute ");
		String operator = input.next();
		
		Test testOBJ = new Test(number1, number2, operator);
	}

}
