import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Array Size: ");
		int arraySize = input.nextInt();
		
		int array[] = new int[arraySize];
		System.out.println("Enter Numbers");
		for (int i = 0; i < arraySize; i++) {
			array[i] = input.nextInt();
		}
		System.out.print("Initil Array ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" "+array[i]);
		}
		System.out.println();
		
		System.out.print("Reverse Array ");
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(" "+array[i]);
		}
	}
}
