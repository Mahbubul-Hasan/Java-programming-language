package prime_numbers;

public class Prime_number2 
{

	public static void main(String[] args) 
	{
		//int number = 2;
		int count = 0;
		for(int j=1; j<1000; j++)
		{
			for(int i=2; i<j; i++)
			{
				if(i!=j)
				{
					if(j % i != 0)
					{
						System.out.print("\t"+j);
						count++;
					}
					else if (count == 50)
					break;
				}
			}
		}
	}
}
