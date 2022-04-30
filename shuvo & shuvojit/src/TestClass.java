import java.util.Scanner;

public class TestClass 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		char shuvo = (Character) null;
		char shuvojit = (Character) null;
		for(int i=0; i<number; i++)
		{
			String name = input.nextLine();
			for(int j=0; j<name.length(); j++)
			{
				if(name.charAt(j) == shuvo)
				{
					shuvo++;
				}
				if(name.charAt(j) == shuvojit)
				{
					shuvojit++;
				}
			}
			System.out.println("SUVO = "+shuvo+", SUVOJIT = "+shuvojit);
		}
	}
}
