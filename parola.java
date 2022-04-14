import java.io.*;
import java.util.*;

public class parola
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        String userName, pass, elCevab, newpass;

        System.out.print("Kullanici adiniz:");
        userName = tara.next();

        System.out.print("Sifrenizi giriniz:");
        pass = tara.next();

        if (pass.equals("patika1*") && userName.equals("alperen"))
            System.out.print("Basariyla giris yapildi..");

        else if (!pass.equals("patika1*") && userName.equals("alperen"))
        {
            System.out.print("Sifrenizi yanlis girdiniz.\nSifrenizi sifirlamak istiyorsaniz 'evet', 'istemiyorsaniz 'hayir' yaziniz:");
            elCevab=tara.next();

            if (elCevab.equals("evet"))
            {
                System.out.print("Yeni sifre olusturulacaktir.\nOlusturacaginiz sifrenin unuttugunuz ve yanlis girdiginiz\n" +
                        "sifreyle ayni olmamasina dikkat ediniz. Yeni sifre:");
                newpass= tara.next();

                if (!newpass.equals("patika1*") && !newpass.equals(pass))
                    System.out.print("Yeni sifre olusturuldu.");

                else
                    System.out.print("Sifre olusturulamadi. Lutfen baska sifre giriniz.");
            }

            else if (elCevab.equals("hayir"))
                System.out.print("Yeni sifre olusturma iptal.");

            else
                System.exit(0);
        }

        else
            System.out.print("Hatali giris. Bilgileriniz kontrol ediniz");
    }


}
