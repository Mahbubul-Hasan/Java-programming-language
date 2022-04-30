import java.util.Scanner;

public class Array 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		char answer[][] = new char[8][10];
		char key[] = new char[10];
		//int i,j;
		int correctAns = 0;
		System.out.println("Enter Correct Answer THEN Students question answers");
		for (int i=0; i<answer.length; i++)
		{
			for(int j=0; j<answer[i].length; j++)
			{
				key[j] = scan.next().charAt(0);
				answer[i][j] = scan.next().charAt(0);
				if (answer[i][j] == key[j])
				{
					correctAns++;
				}
			}
			System.out.println("\nStudent "+(i+1)+" get "+correctAns );
		}
		//System.out.println(correctAns);
	}

}
