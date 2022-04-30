import java.util.Scanner;

/**
 * Created by MaHbUBuL on 2/10/2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int result = num1 + num2;

        System.out.println("X = "+result);
    }
}
