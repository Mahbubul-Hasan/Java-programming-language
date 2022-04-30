package break_continue;

public class Break
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int i;
		
		for (i=0; i<20; i++)
		{
			sum += i;
			
			if (sum >= 100)
				break;
		}
		
		System.out.println("The number is "+i);
		System.out.println("The sum is "+sum);
	}

}
