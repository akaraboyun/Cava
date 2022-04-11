import java.util.Scanner;
import java.lang.Math;

public class manav_kasa
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        double armut, elma, domates, muz, patlican;

        System.out.printf("Armut kg giriniz:");
        armut = tara.nextDouble();

        System.out.printf("Elma kg giriniz:");
        elma = tara.nextDouble();

        System.out.printf("Domates kg giriniz:");
        domates = tara.nextDouble();

        System.out.printf("Muz kg giriniz:");
        muz = tara.nextDouble();

        System.out.printf("Patlican kg giriniz:");
        patlican = tara.nextDouble();

        double toplam = armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5;

        System.out.printf("Toplam tutar:%.2f TL", toplam);
    }
}
