import java.util.*;
import java.lang.Math;


public class hesap_makinesi
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int islem;
        double a, b;

        System.out.println("Bu program, kullanicidan alinan 2 sayi ile 4 islem\nyapan basit bir hesap makinesidir.");

        System.out.print("Islem tipini giriniz:(0-Toplama, 1-Cikarma, 2-Carpma, 3-Bolme)");
        islem = tara.nextInt();

        System.out.print("Ilk sayiyi giriniz:");
        a = tara.nextDouble();

        System.out.print("Ikinci sayiyi giriniz:");
        b = tara.nextDouble();

        switch (islem)
        {
            case 0:
                System.out.print("a+b="+(a+b));
                break;
            case 1:
                System.out.print("a-b="+(a-b));
                break;
            case 2:
                System.out.print("a*b="+(a*b));
                break;
            case 3:
                System.out.print("a/b="+(a/b));
                break;
        }

    }
}
