import java.util.Arrays;
import java.util.Scanner;

public class MinMix 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int inputs = input.nextInt();
		int array[] = new int[inputs];
		int sum = 0;
		for(int i=0; i<inputs; i++)
		{
			array[i] = input.nextInt();
		}
		Arrays.sort(array);
		for(int i=0; i<inputs; i++)
		{
			sum = sum + array[i];
		}
		System.out.println((sum-array[inputs-1])+" "+(sum-array[0]));
	}
}
