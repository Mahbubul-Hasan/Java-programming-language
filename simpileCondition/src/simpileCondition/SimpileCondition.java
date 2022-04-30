package simpileCondition;

import java.util.Scanner;

public class SimpileCondition 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();

		System.out.println( (x<y && y<z) ? "sorted" : "not sorted" );
	}

}
