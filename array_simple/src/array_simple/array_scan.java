package array_simple;

import java.util.Scanner;

public class array_scan 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("Enter some array");
		for(int i=0; i<array.length; i++)
			array[i] = input.nextInt();
		
		for (int i=0; i<array.length; i++)
			System.out.print(array[i]+"\t");
	}
}
