package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter which number do you want?");
		int keynumber = input.nextInt();
		int array[] = {1,2,3,4,5,6,7,8,9,10};

		int left = 0, right = array.length-1, mid;
		
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			mid = (left + right) / 2;
			
			if (keynumber == array[mid]) {
				System.out.println(mid);
				break;
			}
			else if (keynumber > array[mid]) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
	}
}
