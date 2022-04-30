
public class Main {
	public static void main(String[] args) 
	{
		int matrix1[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int matrix2[][]={{1,3,4},{2,4,3},{1,2,4}}; 
		int matrix3[][] = new int[3][3]; 
		
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix2.length; j++) {
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
				
				System.out.print(matrix3[i][j] +" ");
			}
			System.out.println();
		}
	}
}
