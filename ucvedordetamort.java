import java.util.*;
import java.lang.Math;


public class ucvedordetamort
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int a=0, gir, count=0, sum=0;
        float ort;

        System.out.print("Bu kod gireceginiz bir pozitif tam sayiya kadar olan 3 ve 4e tam bolunebilen sayilarin ortalamasini hesaplar.\n" +
                "Bir sayi giriniz:");

        gir = tara.nextInt();

        for(a=1;a<=gir;a++)
        {
            if(a%12==0)
            {
                count++;
                sum+=a;
            }
        }

        ort = sum/count;
        System.out.print("Girdiginiz sayiya kadar olan 3 ve 4e tam bolunebilen sayilarin ortalamasi:" + ort);
    }
}
