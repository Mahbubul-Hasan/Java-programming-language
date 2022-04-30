import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter process number: ");
		int process = input.nextInt();
		System.out.print("Enter resources number: ");
		int resources = input.nextInt(); 
		
		String number[] = new String[process];
		int allocation[][] = new int[process][resources];
		int max[][] = new int[process][resources];
		int avelable[] = new int[resources];
		int need[][] = new int[process][resources];
		
		System.out.println("Enter Allocation ");
		for (int i = 0; i < process; i++) 
		{
			for (int j = 0; j < resources; j++) 
			{
				allocation[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Enter Max ");
		for (int i = 0; i < process; i++) 
		{
			for (int j = 0; j < resources; j++) 
			{
				max[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Enter Avelable ");
		for (int i = 0; i < resources; i++) 
		{
				avelable[i] = input.nextInt();
		}
		
		
		
		
		
		
		
		
		System.out.println("\n");

		for (int i = 0; i < process; i++) 
		{
			System.out.println("Allocation Process "+i);
			for (int j = 0; j < resources; j++) 
			{
				System.out.print(allocation[i][j] +" ");		
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < process; i++) 
		{
			System.out.println("Max Process "+i);
			for (int j = 0; j < resources; j++) 
			{
				System.out.print(max[i][j] +" ");		
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		for (int i = 0; i < process; i++) 
		{
			System.out.println("Avelable Process "+i);
			for (int j = 0; j < resources; j++) 
			{
				if(avelable[j] >= need[i][j])
				{
					avelable[j] += allocation[i][j];
					System.out.print(avelable[j] +" ");
				}
				else {
					continue;
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		for (int i = 0; i < process; i++) 
		{
			System.out.println("Need Process "+i);
			for (int j = 0; j < resources; j++) 
			{
				need[i][j] = max[i][j] - allocation[i][j];
				System.out.print(need[i][j] +" ");		
			}
			System.out.println();
		}
		System.out.println();
	}

}
