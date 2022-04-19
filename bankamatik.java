import java.util.*;


public class bankamatik
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        double bakiye = 1607.8, tutar, bakiyeAlt;
        String userName, pass;
        int sec, kalanHak=3, yHak;

        while (kalanHak>0)
        {
            System.out.print("Kullanici adinizi giriniz:");
            userName = tara.next();
            System.out.print("Parolanizi giriniz:");
            pass = tara.next();
            if (userName.equals("alperen") && pass.equals(("alp123")))
            {
                System.out.println("Bilgileriniz dogru. Hosgeldiniz.");
                boolean dogruluk = true;
                do
                {
                    System.out.print("1- Para cekme\n2- Para yatirma\n3- Bakiye sorgulama\n4- Cikis\nLutfen yapmak istediginiz islemi seciniz:");
                    sec = tara.nextInt();
                    switch (sec)
                    {
                        case 1:
                            System.out.println("Hesabinizdan cekmek istediginiz tutari giriniz:");
                            tutar = tara.nextFloat();
                            if (tutar>bakiye)
                            {
                                System.out.println("Yetersiz hesap bakiyesi, lutfen tekrar deneyiniz.");
                                System.out.printf("Mevcut bakiyeniz: %.2f TL",bakiye);
                            }
                            else
                            {
                                System.out.println("Islem basarili.");
                                bakiyeAlt = bakiye;
                                bakiyeAlt -= tutar;
                                System.out.printf("Mevcut hesap bakiyeniz: %.2f TL\n", bakiyeAlt);
                            }
                            break;
                        case 2:
                            System.out.println("Hesabiniza yatirmak istediginiz tutari giriniz:");
                            tutar = tara.nextFloat();
                            bakiyeAlt = bakiye;
                            bakiyeAlt += tutar;
                            System.out.printf("Mevcut hesap bakiyeniz: %.2f TL\n", bakiyeAlt);
                            break;

                        case 3:
                            System.out.printf("Mevcut hesap bakiyeniz: %.2f TL\n", bakiye);
                            break;

                    }

                }while (sec != 4);
                break;
            }
            else
            {
                yHak = kalanHak-=1;
                System.out.printf("Hatali giris.\nKalan hakkiniz: %d\n", yHak);
                if (yHak == 0)
                    System.out.print("Cok fazla hatali giris yaptiginiz icin hesabiniz bloke olmustur.\nLutfen bankanizla gorusun.");
            }
        }

    }
}
