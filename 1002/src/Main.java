import java.util.Scanner;

/**
 * Created by MaHbUBuL on 2/10/2017.
 */
public class Main
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();


        double result = 3.14159 * num * num;

        System.out.printf("A=%.4f\n",result);


    }
}
