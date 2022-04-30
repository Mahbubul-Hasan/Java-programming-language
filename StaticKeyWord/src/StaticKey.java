
public class StaticKey 
{
	static String school = "Cantonment High School,Jessore";
	public static void change()
	{
		school = "BAF Shaheen College,Jessore";
	}
	public void student(String name, int roll)
	{
		name = "Mahbubul";
		roll = 31;
		System.out.println(name+ "\n" +roll+ "\n" +school);
	}
	
}
