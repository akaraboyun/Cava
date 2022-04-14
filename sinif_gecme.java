import java.util.*;
import java.lang.Math;
import java.io.*;


public class sinif_gecme
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);

        int tr, mat, fzk, kmy, mzk, count=0;
        double sum=0, ort=0;

        System.out.println("Ortalamaniz hesaplanacak ve gecme/kalma durumunuz belirlenecektir.\nOrtalamaya sadece 0 ve 100 arasindaki notlar katilacaktir.");

        System.out.print("Matematik notunuzu giriniz: ");
        mat = tara.nextInt();
        if(mat<100 && mat>0)
        {
            sum+=mat;
            count++;
        }


        System.out.print("Turkce notunuzu giriniz: ");
        tr = tara.nextInt();
        if(tr<100 && tr>0)
        {
            sum+=tr;
            count++;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fzk = tara.nextInt();
        if(fzk<100 && fzk>0)
        {
            sum+=fzk;
            count++;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kmy = tara.nextInt();
        if(kmy<100 && kmy>0)
        {
            sum+=kmy;
            count++;
        }

        System.out.print("Muzik notunuzu giriniz: ");
        mzk = tara.nextInt();
        if(mzk<100 && mzk>0)
        {
            sum+=mzk;
            count++;
        }

        ort = sum/count;
        if(!(ort<100 && ort>=0))
        {
            System.out.print("Something went wrong :(");
        }

        else
        {
            System.out.printf("Ortalamaniz:%.2f\n",ort);
            System.out.print((ort>55)? "Gectinizzz yeeeyyyyy":"Kaldiniz malefes :(");
        }

    }
}
