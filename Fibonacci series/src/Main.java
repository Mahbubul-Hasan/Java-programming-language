
public class Main 
{
	public static void main(String[] args) 
	{
		int number1 = 0;
		int number2 = 1;
		
		System.out.print(number1 +" "+ number2);
		
		for(int i=2; i<10; i++) {
			int number3 = number1 + number2;
			
			System.out.print(" "+number3);
			
			number1 = number2;
			number2 = number3;
		}
	}
}
