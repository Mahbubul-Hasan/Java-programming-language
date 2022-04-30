package future_tuition;

public class Future_tuition 
{
	public static void main(String[] args) 
	{
		double tuition = 10000;
		int year = 0;
		while (tuition < 20000) 
		{
			tuition *= 1.07;
			year++;
		}
		System.out.println("Tuition will be double in "+year);
		System.out.printf("Tuition will be $%.2f in %d  year",tuition,year);
	}
}
