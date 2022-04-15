import java.util.*;
import java.lang.Math;


public class sıralama
{
    public static void main(String[] args)
    {
        float a, b, c;
        Scanner tara = new Scanner(System.in);

        System.out.println("Bu program girilen 3 sayiyi karsilastirir.\nHassasiyet virgulden sonra 2 digit.");
        System.out.print("Ilk sayiyi giriniz:");
        a = tara.nextFloat();

        System.out.print("Ikinci sayiyi giriniz:");
        b = tara.nextFloat();

        System.out.print("Ucuncu sayiyi giriniz:");
        c = tara.nextFloat();

        System.out.printf("1. sayi:%.2f\n2. sayi:%.2f\n3. sayi:%.2f\n\n",a,b,c);

        if (a>b && a>c)
        {
            if (b>c)
                System.out.printf("%.2f>%.2f>%.2f",a,b,c);
            else if (b<c)
                System.out.printf("%.2f>%.2f>%.2f",a,c,b);
            else
                System.out.printf("%.2f>%.2f=%.2f",a,b,c);
        }

        else if (b>a && b>c)
        {
            if (a>c)
                System.out.printf("%.2f>%.2f>%.2f",b,a,c);
            else if (a<c)
                System.out.printf("%.2f>%.2f>%.2f",b,c,a);
            else
                System.out.printf("%.2f>%.2f=%.2f",b,a,c);
        }

        else if (c>a && c>b)
        {
            if (b>a)
                System.out.printf("%.2f>%.2f>%.2f",c,b,a);
            else if (b<a)
                System.out.printf("%.2f>%.2f>%.2f",c,a,b);
            else
                System.out.printf("%.2f>%.2f=%.2f",c,a,b);
        }

        else if(a==b && a>c)
            System.out.printf("%.2f=%.2f>%.2f",a,b,c);

        else if (b==c && b>a)
            System.out.printf("%.2f=%.2f>%.2f",b,c,a);

        else if (a==c && a>b)
            System.out.printf("%.2f=%.2f>%.2f",a,c,b);

        else
            System.out.printf("%.2f=%.2f=%.2f",a,b,c);


    }
}
