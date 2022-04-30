import java.util.Scanner;

public class Array
{

	public static void main(String[] args) 
	{
		int array[] = new int[5];
		//int i;
		int sum = 0;
		double average = 1;
		int count =0;
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter "+array.length+ " numbers");
		for(int i=0; i<array.length; i++)
		{
			//array[i] = scan.nextInt();        //for scan!!!
			array[i] = (int) (Math.random()*10);
			sum += array[i];
			average = (double) sum / array.length;
			if (average >= array[i])
			{
				count++;
			}
		}
		//average = (double) sum / array.length;
		for(int i=0; i<array.length; i++) 
		{
			System.out.println("Array["+i+"] = "+array[i]);
		}
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+average);
		System.out.println("Average greater then equal number = "+count);
	}

}
