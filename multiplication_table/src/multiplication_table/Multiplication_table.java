package multiplication_table;

public class Multiplication_table 
{
	public static void main(String[] args) 
	{
		System.out.println("                               Multiplication Table ");
		
		for (int i=1; i<=10; i++)
		{
			System.out.print("\t"+(i));
		}
		System.out.println("\n________________________________________________________________________________________");
		for (int i=1; i<=10; i++)
		{
			System.out.print(i+" |");
			for (int j=1; j<=10; j++) 
			{
				System.out.print("\t"+i*j);
			}
			System.out.println();
		}
	}
}
