import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a array 4BY6");
		

		int array[][] = new int[4][6];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < 6; j++) {
				array[i][j] = input.nextInt();
			}
		}

		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < 4; j++) {
				if (array[i][1] > array[j][1])
				{
					int[] temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("-------------------------------------------------");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < 6; j++) {
				
				System.out.print(array[i][j] +" ");
			}
			System.out.println();
		}
		
		int sum = array[0][1];
		for (int i = 0; i < array.length; i++) {
			for (int j = 2; j < 3; j++) {	
				sum = sum + array[i][2];
				array[i][3] = sum;
				array[i][4] =  array[i][3] - array[i][1];
				array[i][5] = array[i][4] - array[i][2];
			}
			
		}
		System.out.println("-------------------------------------------------");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < 6; j++) {
				
				System.out.print(array[i][j] +" ");
			}
			System.out.println();
		}
				
	}

}


	
