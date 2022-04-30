package switchMonth;

import java.util.Scanner;

public class SwitchMonth 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day : ");
		int day = input.nextInt();
		
		System.out.print("Enter tha number of day elapsed today : ");
		int futureDay = input.nextInt();
		
		String  day1 = Integer.toString(dayM(day));
		String  futureDay1 = Integer.toString(dayM(futureDay)) ;
		
		System.out.printf("Today is %s and the furute day is %s",day1,futureDay1);
	}
	
	public static int dayM(int number)
	{
		switch (number) 
		{
		case 0:
			System.out.println("sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("wetnesday");
			break;
		case 4:
			System.out.println("Thasday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("sutureday");
			break;
		default:
			break;
		}
		
		return number;
		
	}

}