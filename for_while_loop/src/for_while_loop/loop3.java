package for_while_loop;

public class loop3 
{
	public static void main(String args[])
	{
		int i = 1;
		do 
		{
			int num = 1;
			for (int j=1; j<=i; j++)
			{
				System.out.println(num+"G");
				num += 2;
			}
			System.out.println();
			i++;
		} while (i <= 5);
	}
}
