import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		//Scanner scan = new Scanner (System.in);
		MathGame obj = new MathGame();
		System.out.println("input");
		long startTime = System.currentTimeMillis();
		//int question = scan.nextInt();
		do{
			
			//for (int i=0; i<question; i++)
			//{
				int randomNumber = (int)(Math.random()*4);
				switch (randomNumber)
				{
				case 0:
					obj.addition();
					break;
				case 1:
					obj.subtraction();
					break;
				case 2:
					obj.multiplycation();
					break;
				case 3:
					obj.division();
					break;
				}
			//}
		}
		while(obj.userAns == obj.realAns && obj.userAns2 == obj.realAns2);
		long endTime = System.currentTimeMillis();
		long  totalTime = endTime - startTime;
		System.out.println("You corrected = "+obj.right);
		System.out.println("you errored = "+obj.wrong);
		System.out.println("You take "+totalTime/1000+ " seconds");
		//System.out.println("Summary :"+obj.summary);
	}

}
