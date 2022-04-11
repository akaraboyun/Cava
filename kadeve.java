import java.util.Scanner;

public class kadeve
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);


        System.out.printf("Tutar giriniz (Kusuratli girebilirsiniz.):");
        double tutar = tara.nextDouble();

        double KDVoran = (tutar<1000) ? 0.18:0.08;

        System.out.printf("\nKDV orani = %.2f\nKDV'li fiyat = %.2f" ,KDVoran,(tutar*(1+KDVoran)));
    }
}
