import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int AB = (a+b+Math.abs(a-b))/2;
		int ABC = (AB+c+Math.abs(AB-c))/2;
		System.out.println(ABC+" eh o maior");
	}

}
