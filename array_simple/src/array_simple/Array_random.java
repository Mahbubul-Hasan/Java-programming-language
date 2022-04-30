package array_simple;

public class Array_random 
{
	public static void main(String[] args) 
	{
		int array[] = new int[5];
		for (int i=0; i<array.length; i++)
			array[i] = (int)(Math.random()*11);
		
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]+"\t");
	}
}
