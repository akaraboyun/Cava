import java.util.*;
import java.lang.Math;



public class enbuyuk
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int i=1, n, enk, enb, girdi;
        System.out.print("Bu kod gireceginiz N adet tam sayidan en kucugunu ve en buyugunu bulur.\nKarsilastirmak istediginiz sayi adedini giriniz:");
        n = tara.nextInt();
        System.out.print("1. sayiyi giriniz:");
        girdi = tara.nextInt();
        enk=girdi;
        enb=girdi;
        while (i<n)
        {
            System.out.printf("%d. sayiyi giriniz:",(i+1));
            girdi=tara.nextInt();
            if (girdi<enk)
                enk=girdi;

            if (girdi>=enb)
                enb=girdi;
            i++;
        }

        System.out.printf("En buyuk sayi: %d", enb);
        System.out.printf("\nEn kucuk sayi: %d", enk);
    }
}
