package break_continue;

public class Break2 
{

	public static void main(String[] args) 
	{
		int balance = 10;
		
		for (int i=0; true; i++)
		{
			if (balance < 9)
			{
				break;
			}
			
			balance -= 9;
		}
		System.out.println("Balance is "+balance);
	}
}
