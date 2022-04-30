import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int inputNumber = input.nextInt();
		int remainder, sum = 0, number = inputNumber;
		
		for (int i = 0; inputNumber!=0; i++) {
			remainder = inputNumber % 10;
			
			sum = sum + (remainder * remainder * remainder);
			
			inputNumber = inputNumber / 10;
		}
		
		if (number == sum) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not armstrong number");
		}
	}
}
