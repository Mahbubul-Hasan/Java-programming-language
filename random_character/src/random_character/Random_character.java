package random_character;

public class Random_character 
{
	public static void main(String[] args) 
	{
		char random = (char)('a' + Math.random() * ('z' - 'a' + 1));
		System.out.println(random);
	}
}
