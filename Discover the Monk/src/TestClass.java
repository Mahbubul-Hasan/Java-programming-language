import java.util.Arrays;
import java.util.Scanner;

public class TestClass 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int size_array = input.nextInt();
		int size_query = input.nextInt();
		int array[] = new int[size_array];
		for(int i=0; i<array.length; i++)
		{
			array[i] = input.nextInt();
		}
		Arrays.sort(array);
		for(int i=0; i<size_query; i++) 
		{
			int query = input.nextInt();
			if (Arrays.binarySearch(array, query) < 0)
			{
				System.out.println("NO");
			}
			else 
			{
				System.out.println("YES");
			}
		}
	}
}
