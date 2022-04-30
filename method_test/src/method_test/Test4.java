package method_test;

public class Test4 
{

	public static void main(String[] args) 
	{
		int i = 0;
		while (i <= 4) 
		{
			method(i);
			i++;
		}
		System.out.println("i is "+i);
	}

	private static void method(int i) 
	{
		do 
		{
			if (i % 3 != 0)
				System.out.print(i+"\t");
			
			i--;
		} while (i >= 1);
		
		System.out.println();
	}

}
