import java.util.Scanner;

public class TestClass 
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int flag = 0;
		for(int i=0; i<=number; i++)
		{
			String name = input.nextLine();
			name.toLowerCase();
			for(int j=0; j<name.length(); j++)
			{
				if(name.charAt(j) == 'a' || name.charAt(j) == 'e' || name.charAt(j) == 'i' || name.charAt(j) == 'o' || name.charAt(j) == 'u'  )
				{
					flag++;
				}
			}
			System.out.println(flag);
			flag = 0;
		}
	}
}
