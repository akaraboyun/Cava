import java.util.Scanner;
import java.lang.Math;

public class vucut_kitle
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);

        double boy, kilo, index;

        System.out.printf("Boyunuzu metre cinsinden giriniz: (orn. 1,72)");
        boy = tara.nextDouble();

        System.out.printf("Kilonuzu kg cinsinden giriniz:");
        kilo = tara.nextDouble();

        index = kilo/(boy*boy);

        System.out.printf("\nVucut kitle endeksiniz: %.2f",index);

        if (index<29.9 && index>25)
        {
            System.out.printf("\nFazla kilolusunuz.");
        }

        else if (index>=30 && index<35)
        {
            System.out.printf("\n1. derece obezsiniz.");
        }

        else if (index>35 && index<45)
        {
            System.out.printf("\n2. derece obezsiniz.");
        }

        else if (index>=45)
        {
            System.out.printf("\nD O K T O R   N O W Z A R A D A N   I L E\nA G I R    Y A S A M L A R\nB A S L I Y O R");
        }

        else if (index<=25 && index>18.4)
        {
            System.out.printf("\nNormal kilodasiniz.");
        }

        else
        {
            System.out.printf("\nCok zayifsiniz");
        }

    }
}
