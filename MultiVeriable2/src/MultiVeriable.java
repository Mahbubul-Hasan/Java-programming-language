
public class MultiVeriable 
{
	double average =1;
	public void multi(int...num)
	{
		int sum = 0;
		for (int i=0; i<num.length; i++)
		{
			sum += i;
			System.out.println(sum+ " = " +sum+ " + "+i);
		}
		average = (double)sum / num.length;
		System.out.printf("The average is %.2f\n",average);
	}
	
}
