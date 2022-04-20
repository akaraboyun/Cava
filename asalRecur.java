import java.util.*;

public class asalRecur
{
    public static void main(String[] args)
    {
        primeRec();
    }

    public static void primeRec()
    {
        int num;
        boolean check = false;
        Scanner tara = new Scanner(System.in);
        System.out.print("Bir sayi girin:");
        num= tara.nextInt();

        for (int i = 2; i <= num / 2; ++i)
        {
            if (num%i==0)
            {
                check = true;
                break;
            }
        }
        if (!check)
            System.out.println(num+" bir asal sayidir.");
        else
            System.out.println(num+" bir asal sayi degildir.");
        primeRec();
    }
}
