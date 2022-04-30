package random_mathod;

public class Random 
{
	public static void main(String[] args) 
	{
		for (int i=0; i<5; i++)
		{
			int random = (int) (Math.random()*20);
			System.out.println(random);
		}
	}

}
