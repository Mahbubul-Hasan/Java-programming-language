
import java.util.Scanner;

public class CramersRule 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, c, d, e, f : ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		if (a*d - b*c != 0)
		{
			System.out.println("ojgfgh");
			x = (e*d - b*f) / (a*d - b*c);
			y = (a*f - e*c) / (a*d - b*c);
			
			System.out.println("X is : "+x+" and Y is : "+y);
		}
		
		else 
		{
			System.out.println("The equation has no solution");
		}
	}

}
