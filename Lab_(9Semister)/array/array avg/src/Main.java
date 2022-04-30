import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int arraySize = input.nextInt();
		
		int array1[] =  new int[arraySize];
		int array2[] =  new int[arraySize];
		
		System.out.println("Enter 1st array");
		for (int i = 0; i < array1.length; i++) 
		{
			array1[i] = input.nextInt();
		}
		
		System.out.println("Enter 2nd array");
		for (int i = 0; i < array2.length; i++) 
		{
			array2[i] = input.nextInt();
		}
		
		System.out.print("1st array: ");
		for (int i = 0; i < array1.length; i++) 
		{
			System.out.print(" "+array1[i]);
		}
		System.out.println();
		
		System.out.print("2nd array: ");
		for (int i = 0; i < array2.length; i++) 
		{
			System.out.print(" "+array2[i]);
		}
		System.out.println();
		
		int array3[] = new int[arraySize];
		for (int i = 0; i < array2.length; i++) 
		{
			array3[i] = array3[i] + (array1[i] + array2[i]);
			System.out.print((i+1)+" sum = " + (array1[i] + array2[i])+"\n");
		}
		int sum = 0;
		double avg = 1;
		for (int i = 0; i < array3.length; i++) 
		{
			sum = sum + array3[i];
		}
		
		System.out.print("Average ");
		avg = (double)sum / array3.length;
		System.out.println(avg);
	}
}
