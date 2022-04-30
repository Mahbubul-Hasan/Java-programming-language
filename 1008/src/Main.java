import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

/**
 * Created by MaHbUBuL on 2/10/2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int employeesNumber = scan.nextInt();
        int hour = scan.nextInt();
        double amount = scan.nextDouble();

        double salary = hour * amount;
        System.out.println("NUMBER = "+employeesNumber);
        System.out.printf("SALARY = U$ %.2f\n",salary);
    }
}
