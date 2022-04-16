import java.util.*;
import java.lang.Math;



public class dordunvebesin
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int gir, a;
        System.out.print("Bu kod gireceginiz sayiya kadar olan 4 ve 5'in kuvvetlerini bulur.\nBir sayi giriniz:");
        gir= tara.nextInt();

        System.out.print("Girdiginiz "+gir+" sayisina kadar olan 4'un kuvvetleri:");
        for(a=1;a<gir;a=a*4)
        {
            System.out.printf("\n%d",a);
        }

        System.out.print("\nGirdiginiz "+gir+" sayisina kadar olan 5'in kuvvetleri:");
        for(a=1;a<gir;a=a*5)
        {
            System.out.printf("\n%d",a);
        }

    }
}
