import java.util.*;
public class asalSayi
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int girdi, i, k, ct;
        System.out.print("Bu kod gireceginiz sayiya kadar olan asal sayilari ekrana yazar.\nBir tamsayi giriniz:");
        girdi=tara.nextInt();

        for(i=2;i<=girdi;i++)
        {
            ct=0;
            for(k=1;k<i;k++)
            {
                if(i%k==0)
                    ct++;
            }
            if(ct<=1)
            System.out.printf("%d\n", i);
        }

    }
}
