import java.util.Scanner;

public class MathGame 
{
	int right,wrong,userAns,realAns;
	double userAns2,realAns2;
	String summary = "";
	Scanner scan = new Scanner (System.in);
	public void addition()
	{
		int num1 = (int) (Math.random()*20);
		int num2 = (int) (Math.random()*20);
		System.out.println(num1+" + "+num2+" ? ");
		userAns = scan.nextInt();
		realAns = num1 + num2;
		if(userAns == realAns)
		{
			System.out.println("ok");
			right++;
		}
		else
		{
			System.out.println("wrong");
			System.out.println("right ans is "+realAns);
			wrong++;
		}
		//summary = summary +"\n" +num1+ " + " +num2+ " = " +userAns+ " it was " +(userAns == realAns);
	}
	
	public void subtraction()
	{
		int num1 = (int) (Math.random()*20);
		int num2 = (int) (Math.random()*20);
		if (num2 > num1)
		{
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println(num1+" - "+num2+" ? ");
		userAns = scan.nextInt();
	    realAns = num1 - num2;
		if(userAns == realAns)
		{
			System.out.println("ok");
			right++;
			
		}
		else
		{
			System.out.println("wrong");
			System.out.println("right ans is "+realAns);
			wrong++;
		}
		//summary = summary+"\n"+num1+ " - " +num2+ " = " +userAns+ " it was " +(userAns == realAns);
	}
	
	public void multiplycation()
	{
		int num1 = (int) (Math.random()*20);
		int num2 = (int) (Math.random()*20);
		System.out.println(num1+" * "+num2+" ? ");
		userAns = scan.nextInt();
		realAns = num1 * num2;
		if(userAns == realAns)
		{
			System.out.println("ok");
			right++;	
		}
		else
		{
			System.out.println("wrong");
			System.out.println("right ans is "+realAns);
			wrong++;
		}
		//summary = summary+"\n"+num1+ " * " +num2+ " = " +userAns+ " it was " +(userAns == realAns);
	}
	
	public void division()
	{
		int num1 = (int) (Math.random()*20);
		int num2 = (int) (Math.random()*20);
		if (num1==0 || num2==1 || num2==0 || num2==1)
		{
			num1+=2;
			num2+=2;
		}
		if (num2 > num1)
		{
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println(num1+" / "+num2+" ? ");
		userAns2 = scan.nextDouble();
		realAns2 = (double) num1 / num2;
		realAns2 = Math.floor(realAns2 * 100) / 100;
		if(userAns2 == realAns2)
		{
			System.out.println("ok");
			right++;
			
		}
		else
		{
			System.out.println("wrong");
			System.out.println("right ans is "+realAns);
			wrong++;
		}
		//summary = summary+"\n"+num1+ " / " +num2+ " = " +userAns+ " it was " +(userAns == realAns);
	}
}
