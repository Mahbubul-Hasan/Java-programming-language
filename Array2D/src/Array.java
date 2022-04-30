import java.util.Scanner;

public class Array 
{

	public static void main(String[] args) 
	{
		Scanner  scan = new Scanner(System.in);
		int result[][] = new int[5][4];
		int sum = 0;
		for (int i=0; i<result.length; i++)
		{
			for (int j=0; j<result[i].length; j++)
			{
				result[i][j] = scan.nextInt();
			}
		}
		for (int i=0; i<result.length; i++)
		{
			for (int j=0; j<result[i].length; j++)
			{
				System.out.println("result["+i+"]["+j+"] = " +result[i][j]);
				sum += result[i][j];
			}
			System.out.println("Sum = "+sum);
			System.out.println();
			sum = 0;
		}
		
	}

}
