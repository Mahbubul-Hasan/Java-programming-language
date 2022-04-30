import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		
		double X = Math.pow(x1-x2, 2);
		double Y = Math.pow(y2-y1, 2);
		double distance = Math.sqrt(X+Y);
		System.out.printf("%.4f\n",distance);
	}

}
