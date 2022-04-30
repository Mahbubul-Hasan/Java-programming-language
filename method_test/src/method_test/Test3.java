package method_test;

public class Test3 
{
	public static void main(String[] args) 
	{
		int times = 3;
		System.out.println("Before the call,"+" variable times is "+times);
		
		nPrintln("welcome to java!", times);
		
		System.out.println("After the call,"+" variabe time is "+times);
	}

	private static void nPrintln(String message, int n) 
	{
		while (n > 0) 
		{
			System.out.println("n = "+n);
			System.out.println(message);
			n--;
		}
	}
}
