import java.util.*;
import java.lang.Math;

public class harmonik
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int i=1, gir;
        float sum=0;
        System.out.print("Harmonik serisini hesaplamak istediginiz pozitif tamsayi degerini giriniz:");
        gir = tara.nextInt();

        while (i<=gir)
        {
            sum+=(float) 1/i;
            i++;
        }

        System.out.printf("Sonuc= %.4f",sum);
    }
}
