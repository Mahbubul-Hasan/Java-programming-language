package array_output;

public class Array 
{
	public static void main(String[] args) 
	{
		int number = 0;
		int numbers[] = new int[1];
		
		m(number, numbers);
		System.out.println("number is "+number+" ans number [0] is "+numbers[0]);
	}

	private static void m(int number, int[] numbers) 
	{
		number = 3;
		numbers[0] = 3;
	}
}
