import java.util.Scanner;

/**
 * Created by MaHbUBuL on 2/10/2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double basic = scan.nextDouble();
        double parsentage = scan.nextDouble();

        double salary = ((parsentage *15)/100) +basic;
        System.out.printf("TOTAL = R$ %.2f\n",salary);
    }
}
