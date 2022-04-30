import java.util.Scanner;

/**
 * Created by MaHbUBuL on 2/10/2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        double result = (((num1 * 2) + (num2 * 3) + (num3 * 5)) /(2 + 3 + 5));

        System.out.printf("MEDIA = %.1f\n",result);
    }
}
