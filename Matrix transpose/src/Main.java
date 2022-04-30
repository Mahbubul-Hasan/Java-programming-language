public class Main 
{

	public static void main(String[] args) 
	{
		int original[][]={{1,3,4},{2,4,3},{3,4,5}};
		int transpose[][] = new int[3][3];
		
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original.length; j++) {
				transpose[i][j] = original[j][i];
			}
		}
		
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original.length; j++) {
				System.out.print(original[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original.length; j++) {
				System.out.print(transpose[i][j] +" ");
			}
			System.out.println();
		}

	}

}
