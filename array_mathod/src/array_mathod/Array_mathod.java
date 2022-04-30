package array_mathod;

public class Array_mathod 
{
	public static void main(String[] args) 
	{
		int x = 1;
		int y[] = new int[10];
		mathod(x, y);
		
		System.out.println("x is "+x);
		System.out.println("y[0] is "+y[0]);
	}

	private static void mathod(int x, int[] y) 
	{
		x = 1001;
		y[0] = 5555;
	}
}
