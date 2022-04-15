import java.util.*;
import java.lang.Math;

public class artikyil
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int yil;
        System.out.print("Artik yil hesaplayiciya hosgeldiniz.\nYil giriniz:");
        yil = tara.nextInt();

        if (yil%4==0)
        {
            if (yil%100!=0)
                System.out.println("Girdiginiz "+yil+" yili artik yildir.");

            else if ((yil%100==0) && (yil%400==0))
                System.out.println("Girdiginiz "+yil+" yili artik yildir.");

            else
                System.out.println("Girdiginiz "+yil+" yili artik yil degildir.");
        }

        else
            System.out.println("Girdiginiz "+yil+" yili artik yil degildir.");
    }
}
