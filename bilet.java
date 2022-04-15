import java.util.*;
import java.lang.Math;


public class bilet
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int yas, tip;
        float dist;
        double ucret=0;

        System.out.println("Bu program ucak bileti fiyati hesaplar.");
        System.out.print("Yas giriniz:");
        yas = tara.nextInt();
        if(yas<0)
        {
            System.out.print("Hatali giris!");
            System.exit(0);
        }

        System.out.print("Mesafeyi km olarak giriniz. (orn. 560,45):");
        dist = tara.nextFloat();
        if(dist<=0)
        {
            System.out.print("Hatali giris!");
            System.exit(0);
        }

        System.out.print("Bilet turunu seciniz.(1-> Tek Yon, 2-> Gidis-Donus):");
        tip = tara.nextInt();
        if(tip!=2 && tip!=1)
        {
            System.out.print("Hatali giris!");
            System.exit(0);
        }

        else if(tip==1)
        {
            if(yas<=12 && yas>=0)
                ucret = (dist*0.1/2);

            else if(yas>12 && yas<=24)
                ucret = (dist*0.1*9/10);

            else if(yas>=65)
                ucret = (dist*0.1*7/10);

            else
                ucret = (dist*0.1);
        }

        else if(tip==2)
        {
            if(yas<=12 && yas>=0)
                ucret = (dist*0.1/2*4/5*2);

            else if(yas>12 && yas<=24)
                ucret = (dist*0.1*9/10*4/5*2);

            else if(yas>=65)
                ucret = (dist*0.1*7/10*4*2/5);

            else
                ucret = (dist*0.1*4*2/5);
        }

        System.out.printf("Odemeniz gereken ucret:%.2f TL",ucret);
    }
}
