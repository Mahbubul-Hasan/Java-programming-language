import java.util.Scanner;

public class Array 
{
	Scanner scan  = new Scanner(System.in);
	public void array()
	{
		System.out.println("Enter arrat size");
		int size = scan.nextInt();
		int num[] = new int[size];
		for (int i=0; i<size; i++)
		{
			int num1= ((int) Math.random()*100);
		}
		System.out.println("Index \t Value");
		for (int i = 0; i<size; i++)
		{
			System.out.println(i+"\t"+num[i]);
		}
	}
}
