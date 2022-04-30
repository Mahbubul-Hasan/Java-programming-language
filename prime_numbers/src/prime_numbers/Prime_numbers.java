package prime_numbers;

import java.util.Scanner;

public class Prime_numbers 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = input.nextInt();
		int flag = 0;
		
		if (number == 0 || number == 1) {
			System.out.println(number+" is not prime number");
		}
		else{
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					System.out.println(number+" is not prime number");
					break;
				} else {
					flag ++;
				}
			}
			if (flag != 0) {
				System.out.println(number+" is prime number");
			}
		}
	}

}
