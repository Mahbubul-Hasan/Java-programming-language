package power;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		System.out.println("Enter the radius");
		Scanner inpute = new Scanner(System.in);
		int r = inpute.nextInt();
		
		double area = (double)((Math.pow(r, 2))*3.1416);
		System.out.printf("So Area is %.5f\n",area);
	}

}
