package timeCounting;

public class Time 
{
	public static void main(String args[])
	{
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		for (int i=0; i<10000; i++)
		{
			System.out.println("...");
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
	    long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}

}
