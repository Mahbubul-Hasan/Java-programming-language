package break_continue;

public class Continue2 
{

	public static void main(String[] args) 
	{
		int balance = 10;
		
		for (int i=0; true; i++)
		{
			if (balance < 9)
			{
				continue;
			}
			
			balance -= 9;
			System.out.println("Balance is "+balance);
		}
		
		//System.out.println("Balance is "+balance);
	}

}
