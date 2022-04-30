import java.util.Scanner;

public class Array 
{
	Scanner scan = new Scanner(System.in);
	
	public void Avaerage ()
	{
		System.out.println("Enter array size");
		int size = scan.nextInt();
		int num[] = new int [size];
		int sum =0;
		double average = 1;
		System.out.println("Enter "+size+ " numbers");
		for (int i=0; i<size; i++)
		{
			num[i] = scan.nextInt();
			sum = sum + num[i];
			average = (double) sum / num.length;
		}
		System.out.printf("The result is %.2f\n",average);
	}
}
