package patient;

import java.util.Scanner;

public class TestClass 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int flag = 0;
        for(int i=0; i<number; i++){
            int vaccines = input.nextInt();
            int patients = input.nextInt();
            if(vaccines > patients){
              flag++;
            }
        }
        if(flag==number){
         System.out.println("Yes");
        }
        else{
            System.out.println("No"); 
        }
	}

}
