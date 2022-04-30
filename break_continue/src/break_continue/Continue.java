package break_continue;

public class Continue 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int i;
		
		for (i=0; i<20; i++)
		{
			if (i == 10 || i == 11)
			{
				continue;
			}
			sum += i;
		}
		System.out.println("The sum is "+sum);
	}

}
