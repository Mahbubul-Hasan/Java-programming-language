package for_while_loop;

public class Loop2 
{
	public static void main(String[] args) 
	{
		int i = 5;
		while (i >= 1) 
		{
			int num = 1;
			for (int j=1; j<=i; j++)
			{
				System.out.println(num+"xxx");
				num *= 2;
			}
			System.out.println();
			i--;
		}
	}
}
