package bubble_sort;

public class Bubble_sort 
{
	public static void main(String[] args) 
	{
		int array[] = {4, 3, 2, 1}; 
		int flag = 0;
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
					flag++;
				}
			}
		}
		if (flag == 0) {
			System.out.println("Alrady sorted");
		}
		else {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] +" ");
			}
		}
	}
}
