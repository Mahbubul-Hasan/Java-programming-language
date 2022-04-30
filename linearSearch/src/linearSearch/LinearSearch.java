package linearSearch;

import java.util.Scanner;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int array[] = {1,2,3,4,5,6,7,8,9,10};

		System.out.println("Enter number do you want?");
		int keyNumber = input.nextInt();
		
		for (int i = 0; i < array.length; i++) {
			if (keyNumber == array[i]) {
				System.out.println(i+1);
			}
		}
	}
}
