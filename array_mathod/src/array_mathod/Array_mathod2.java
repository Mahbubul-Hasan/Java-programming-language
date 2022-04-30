package array_mathod;

public class Array_mathod2 
{
	public static void main(String[] args) 
	{
		int a[] = {1, 2};
		
		System.out.println("Before invoking swap");
		System.out.println("array is {"+a[0]+", "+a[1]+"}");
		
		swap(a[0], a[1]);
		System.out.println("\nAfter invoking swap");
		System.out.println("array is {"+a[0]+", "+a[1]+"}");
		
		System.out.println("\nBefore invoking swapFIrstTwoInArray");
		System.out.println("array is {"+a[0]+", "+a[1]+"}");
		
		swapFIrstTwoInArray(a);
		System.out.println("\nAfter invoking swapFIrstTwoInArray");
		System.out.println("array is {"+a[0]+", "+a[1]+"}");
	}

	private static void swapFIrstTwoInArray(int a[]) 
	{
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
	}

	private static void swap(int number1, int number2) 
	{
		int temp = number1;
		number1 = number2;
		number2 = temp;
	}
}
