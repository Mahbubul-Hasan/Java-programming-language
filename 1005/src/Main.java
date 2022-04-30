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

        double result = (((num1 * 3.5) + (num2 * 7.5)) /(3.5 + 7.5));

        System.out.printf("MEDIA = %.5f\n",result);
    }
}

