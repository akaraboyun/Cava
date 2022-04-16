import java.util.*;
import java.lang.Math;


public class teksayiyakadar4unkatlari
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int gir, sum=0;
        System.out.println("Bu kod tek sayi girisi olana kadar girilen sayilardan 4un katlari olanlari toplayip yazdirir.");

        do
        {
            System.out.print("Bir sayi giriniz:");
            gir= tara.nextInt();
            if(gir%4==0)
                sum+=gir;
        }
        while (gir%2==0);

        System.out.print("Girdiginiz "+gir+" sayisina kadar olan 4un katlari toplami:"+sum);
    }
}
