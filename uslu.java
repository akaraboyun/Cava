import java.util.*;
import java.lang.Math;


public class uslu
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int m, n, i, sonuc=1;
        System.out.print("Bu program m^n seklinde uslu sayi hesaplar.\nm sayisini giriniz:");
        m = tara.nextInt();
        System.out.print("n sayisini giriniz:");
        n = tara.nextInt();

        for(i=1;i<=n;i++)
            sonuc*=m;

        System.out.printf("Sonuc:%d",sonuc);
    }
}
