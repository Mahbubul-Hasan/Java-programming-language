package arguments_by_values;

public class Arguments_by_values 
{

	public static void main(String[] args) 
	{
		int number = 1;
		System.out.println("Bfore the call, number is "+number);
		increment(number);
		System.out.println("After the call, number is "+number);
	}

	private static void increment(int number) 
	{
		number++;
		System.out.println("number inside the method is "+number);
	}
}
