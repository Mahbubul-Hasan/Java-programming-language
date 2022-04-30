
public class Test 
{
	int number1, number2;
	String operator;
	public Test(int number1, int number2, String operator) {
		this.number1 = number1;
		this.number2 = number2;
		this.operator = operator;
		
		switch (operator) {
		case "+":
			System.out.println(number1 + number2);
			break;
		case "-":
			System.out.println(number1 - number2);
			break;
		case "*":
			System.out.println(number1 * number2);
			break;	
		case "/":
			System.out.println((double)number1 / (double)number2);
				break;	
		}
	}



	
}
