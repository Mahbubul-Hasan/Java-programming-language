public class Main 
{
	public static void main(String[] args) 
	{
		int array[]={1,2,5,6,3,2};
		
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i] % 2 == 0) 
			{
				System.out.println(array[i] +" Even");
			}
			else 
			{
				System.out.println(array[i] +" Odd");
			}
		}
	}
}
