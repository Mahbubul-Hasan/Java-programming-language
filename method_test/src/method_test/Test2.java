package method_test;

public class Test2 
{

	public static void main(String[] args) 
	{
		int i = 1;
		while (i <= 6) 
		{
			method(i, 2);
			i++;
		}
	}

	private static void method(int i, int number) 
	{
		for(int j = 1; j <= i; j++)
		{
			System.out.println(number+"\t");
			number = number * 2;
		}
		System.out.println();
	}
}
