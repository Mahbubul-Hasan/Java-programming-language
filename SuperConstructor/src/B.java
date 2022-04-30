
public class B extends A
{
	int z;
	B(int x, int y, int z)
	{
		super(x, y);
	}
	public void multy()
	{
		int result = x * y * z;
		System.out.println(result);
	}
}
