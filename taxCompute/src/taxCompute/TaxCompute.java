package taxCompute;

import java.util.Scanner;

public class TaxCompute 
{
	public static void main(String[] args) 
	{
		double  tax;
		Scanner input = new Scanner(System.in);
		System.out.println("* 0 for Singel \n* 1 for Married Filing Jointly  or Qualifying Window(er) \n* 2 for Married Filing Separately \n* 3 for Head of Household");
		
		System.out.printf("Enter the filing statusee : ");
		int choose = input.nextInt();
		
		System.out.printf("Enter the taxable income : ");
		int income = input.nextInt();
		
		if (choose == 0)
		{
			if (income <= 8350)
			{
				tax = (double) income * 0.10;
				display(tax);
			}
			
			else if (income <= 33950)
			{
				tax = (double) (8350*0.10 + (income - 8350)*0.15);
				display(tax);
			}
			
			else if (income <= 82250)
			{
				tax = (double)(8350*0.10 + (33950 - 8350)*0.15 + (income - 33950)* 0.25);
				display(tax);
			}
			
			else if (income <= 171550)
			{
				tax = (double)(8350*0.10 + (33950 - 8350)*0.15 + (82250 - 33950)* 0.25 + (income - 82250)* 0.28);
				display(tax);
			}
			
			else if (income <= 372950)
			{
				tax = (double) (8350*0.10 + (33950 - 8350)*0.15 + (82250 - 33950)* 0.25 + (171550 - 82250)* 0.28 + (income - 171550)* 0.33);
				display(tax);
			}
			
			else if (income > 372950)
			{
				tax = (double) (8350*0.10 + (33950 - 8350)*0.15 + (82250 - 33950)* 0.25 + (171550 - 82250)* 0.28 + (372950 - 171550)* 0.33 + (income - 372950)* 0.35);
				display(tax);
			}
			
		}
		
		else if (choose == 1)
		{
			if (income <= 8350)
			{
				tax = (double) income * 0.10;
				display(tax);
			}
			
			else if (income <= 33950)
			{
				tax = (double) income * 0.15;
				display(tax);
			}
			
			else if (income <= 82250)
			{
				tax = (double) income * 0.25;
				display(tax);
			}
			
			else if (income <= 171550)
			{
				tax = (double) income * 0.28;
				display(tax);
			}
			
			else if (income <= 372950)
			{
				tax = (double) income * 0.33;
				display(tax);
			}
			
			else if (income > 372950)
			{
				tax = (double) income * 0.35;
				display(tax);
			}
		}
		
		else if (choose == 2)
		{
			if (income <= 8350)
			{
				tax = (double) income * 0.10;
				display(tax);
			}
			
			else if (income <= 33950)
			{
				tax = (double) income * 0.15;
				display(tax);
			}
			
			else if (income <= 82250)
			{
				tax = (double) income * 0.25;
				display(tax);
			}
			
			else if (income <= 171550)
			{
				tax = (double) income * 0.28;
				display(tax);
			}
			
			else if (income <= 372950)
			{
				tax = (double) income * 0.33;
				display(tax);
			}
			
			else if (income > 372950)
			{
				tax = (double) income * 0.35;
				display(tax);
			}
		}
		
		else if (choose == 3)
		{
			if (income <= 8350)
			{
				tax = (double) income * 0.10;
				display(tax);
			}
			
			else if (income <= 33950)
			{
				tax = (double) income * 0.15;
				display(tax);
			}
			
			else if (income <= 82250)
			{
				tax = (double) income * 0.25;
				display(tax);
			}
			
			else if (income <= 171550)
			{
				tax = (double) income * 0.28;
				display(tax);
			}
			
			else if (income <= 372950)
			{
				tax = (double) income * 0.33;
				display(tax);
			}
			
			else if (income > 372950)
			{
				tax = (double) income * 0.35;
				display(tax);
			}
		}
	}

	private static void display(Double tax) 
	{
		System.out.printf("Tax is %.2f\n",tax);
	}
}
		

