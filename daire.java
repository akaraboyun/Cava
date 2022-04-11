import java.util.Scanner;
import java.lang.Math;

public class daire
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);

        double rad1, deg;

        System.out.printf("Cevresini ve alanini hesaplamak istediginiz dairenin yaricapini giriniz (Kusuratli girebilirsiniz):");
        rad1 = tara.nextDouble();

        double cvr = 2*(Math.PI)*rad1, alan1 = (Math.PI)*rad1*rad1;

        System.out.printf("Dairenin cevresi = %.2f\nDairenin alani = %.2f",cvr,alan1);

        System.out.printf("\nAlanini hesaplamak istediginiz daire diliminin merkez acisini derece cinsinden giriniz:(0-360)");
        deg = tara.nextDouble();

        System.out.printf("Alanini hesaplamak istediginiz daire diliminin yaricapini giriniz (Kusuratli girebilirsiniz):");
        double rad2 = tara.nextDouble();
        double alandilim = (Math.PI)*rad2*rad2*deg/360;

        System.out.printf("Daire diliminin alani = %.2f",alandilim);

    }
}
