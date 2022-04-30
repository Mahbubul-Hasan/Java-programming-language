import java.util.Scanner;

public class Array 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int result[][] = new int[5][4];
		int sum = 0;
		for (int i=0; i<result.length; i++)
		{
			for (int j=0; j<result[i].length; j++)
			{
				result[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<result[0].length; i++)
		{
			for(int j=0; j<result.length; j++)
			{
				sum += result[j][i];
			}
			System.out.println("Sum = "+sum);
			sum = 0;
		}
	}
}
