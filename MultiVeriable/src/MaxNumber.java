
public class MaxNumber 
{
	public void maxnum(int...num)
	{
		int max = num[0];
		for (int i=0; i<num.length; i++)
		{
			if (num[i] > max)
			max = num[i];
		}
		System.out.println(max);
	}
	
}
