import java.util.*;
import java.lang.Math;

public class kombinasyon
{
    public static int faktCalc(int a)
    {
        int i, res=1;
        for(i=1;i<=a;i++)
            res*=i;
        return res;
    }

    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int n,r,komb;
        System.out.printf("Bu kod C(n,r) formatinda kombinasyon hesaplar.\nn sayisini giriniz:");
        n = tara.nextInt();
        System.out.printf("r sayisini giriniz:");
        r = tara.nextInt();

        if (r>n)
            System.out.printf("Hatali giris yaptiniz!");

        komb = faktCalc(n)/faktCalc(r)/faktCalc(n-r);
        System.out.printf("\nC(%d,%d)=%d",n,r,komb);
    }

}
