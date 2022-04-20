import java.util.*;

public class gelismisHesapMak
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int op, n1, n2;
        System.out.print("Gelismis hesap makinesine hosgeldiniz.\nMenu:\n" +
                "1- Toplama\n2- Cikarma\n3- Carpma\n4- Bolme\n5- Uslu Sayi\n6- Faktoriyel\n7- Mod\n8- Dikdortgen alan ve cevre hesap\n0- Cikis\n");

        do
        {
            System.out.print("Lutfen bir islem seciniz:");
            op = tara.nextInt();
            switch (op)
            {
                case 1:
                    sum();
                    break;
                case 2:
                    subs();
                    break;
                case 3:
                    mux();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    pow();
                    break;
                case 6:
                    fact();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rect();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }while (op!=0);


    }

    static void sum()
    {
        int cnt;
        float temp, sum=0;
        Scanner tara = new Scanner(System.in);
        System.out.print("Toplama islemi yapilacak sayi adedi:");
        cnt= tara.nextInt();
        for(int i=1;i<=cnt;i++)
        {
            System.out.print("Sayi giriniz:");
            temp = tara.nextFloat();
            sum+=temp;
        }
        System.out.println("Sonuc="+sum);
    }

    static void subs()
    {
        int cnt;
        float temp, sum=0;
        Scanner tara = new Scanner(System.in);
        System.out.print("Cikarma islemi yapilacak sayi adedi:");
        cnt= tara.nextInt();
        for(int i=1;i<=cnt;i++)
        {
            System.out.print("Sayi giriniz (-a biciminde):");
            temp = tara.nextFloat();
            sum+=temp;
        }
        System.out.println("Sonuc="+sum);
    }

    static void mux()
    {
        int cnt,sum=1;
        float temp;
        Scanner tara = new Scanner(System.in);
        System.out.print("Carpma islemi yapilacak sayi adedi:");
        cnt= tara.nextInt();
        for(int i=1;i<=cnt;i++)
        {
            System.out.printf("Sayi giriniz:");
            temp= tara.nextFloat();
            sum*=temp;
        }
        System.out.println("Sonuc="+sum);
    }

    static void div()
    {
        Scanner tara = new Scanner(System.in);
        int cnt;
        float num, res = 0.0F;
        System.out.print("Bolme islemi yapilacak sayi adedi:");
        cnt = tara.nextInt();

        for (int i=1; i<=cnt; i++)
        {
            System.out.print(i + ". sayi:");
            num = tara.nextFloat();
            if (i!=1 && num==0)
            {
                System.out.println("Boleni 0 giremezsiniz.");
                continue;
            }
            if (i==1)
            {
                res=num;
                continue;
            }
            res/=num;
        }
        System.out.println("Sonuc: " +res);
    }

    static void pow()
    {
        float base, baseTemp, deg;
        Scanner tara = new Scanner(System.in);
        System.out.print("a^b seklinde hesaplamak istediginiz a sayisini giriniz:");
        base= tara.nextFloat();
        baseTemp=base;
        System.out.print("b sayisini giriniz:");
        deg= tara.nextFloat();
        for(int i=1;i<deg;i++)
            baseTemp*=base;
        System.out.println(base+" ^ "+deg+" = "+baseTemp);
    }

    static void fact()
    {
        int res=1, num;
        Scanner tara = new Scanner(System.in);
        System.out.print("N! hesaplamak icin N sayisini giriniz:");
        num=tara.nextInt();

        for(int i=1;i<=num;i++)
            res*=i;
        System.out.println(num+" ! = "+res);
    }

    static void mod()
    {
        float a, b;
        Scanner tara = new Scanner(System.in);
        System.out.print("M(a,b) islemi icin a sayisini giriniz:");
        a=tara.nextFloat();
        System.out.print("b sayisini giriniz:");
        b=tara.nextFloat();
        System.out.println("M("+a+" , "+b+")="+a%b);
    }

    static void rect()
    {
        float kenar1, kenar2;
        Scanner tara = new Scanner(System.in);
        System.out.print("Alanini ve cevresini hesaplamak istediginiz dikdortgenin bir kenar uzunlugunu giriniz:");
        kenar1=tara.nextFloat();
        System.out.print("Alanini ve cevresini hesaplamak istediginiz dikdortgenin diger kenar uzunlugunu giriniz:");
        kenar2=tara.nextFloat();
        System.out.println("Kenarlari "+kenar1+" ve "+kenar2+" olan dikdortgenin alani = "+kenar1*kenar2+", cevresi = "+2*(kenar1+kenar2));
    }
}
