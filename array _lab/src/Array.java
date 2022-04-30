import java.util.Scanner;

public class Array 
{
	public static void main(String[] args) 
	{
		int array_number[] = new int[5];
		int found_number[] = {-1,-1,-1,-1,-1};
		int key_number = 3;
		int flag = 0;
		int i=0, j=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter array numbers");
		for (i=0; i<array_number.length; i++)
		{
			array_number[i] = input.nextInt();
		}
		
		for (i=0; i<array_number.length; i++)
		{
			if (array_number[i] == key_number)
			{
				found_number[j++] = i;
				flag++;
			}
		}
		if (flag != 0)
		{
			System.out.print(key_number+" is fount at ");
			for (j=0; j<array_number.length; j++)
			{
				if (found_number[j] != -1)
				{
					System.out.print("\t"+found_number[j]);
				}
			}
		}
		
		if (flag == 0)
		{
			System.out.println("Sorry!!!");
		}
	}
}
