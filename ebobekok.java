import java.util.*;
import java.lang.Math;


public class ebobekok
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int int1, int2, i=1, ebob, bgNum, ekok;
        System.out.print("Ebob ve Ekok'unu bulmak istediginiz iki sayidan ilkini giriniz:");
        int1 = tara.nextInt();
        System.out.print("Ikinci sayiyi giriniz:");
        int2 = tara.nextInt();

        bgNum = Math.max(int1, int2);

        while (bgNum>=1)
        {
            if (int1%bgNum==0 && int2%bgNum==0)
            {
                ebob = bgNum;
                System.out.println("Girdiginiz iki sayinin Ebob'u: "+ebob);
                break;
            }
            bgNum-=1;
        }

        while (i<=(int1*int2))
        {
            if (i%int1==0 && i%int2==0)
            {
                ekok=i;
                System.out.print("Girdiginiz iki sayinin Ekok'u: "+ekok);
                break;
            }
            i++;
        }
    }
}


/*
Array ile 2'den fazla sayı ebob-ekok prototipi
Scanner tara = new Scanner(System.in);
        int ebok[] = new int[20], girdi,test=1;
        System.out.println("Bu kod, gireceginiz sayilarin ebob ve ekokunu bulur.\nBir pozitif tamsayi giriniz:");
        girdi = tara.nextInt();
        if(girdi<1)
        {
            System.out.print("Hatali giris. Cikilacak.");
            System.exit(0);
        }
        else
        ebok[0]=girdi;
        while(girdi!=0)
        {
            System.out.print("Bir pozitif tamsayi giriniz. (Girisi sonlandirmak icin 0 giriniz):");
            girdi = tara.nextInt();
            ebok[test]=girdi;
            test+=1;
        }

        while()
 */