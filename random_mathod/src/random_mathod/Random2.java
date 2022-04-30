package random_mathod;

public class Random2 
{

	public static void main(String[] args) 
	{
		for (int i=0; i<10; i++)
		{
			int random = 5 + (int)(Math.random()*20);
			System.out.println(random);
		}
	}

}
