import java.util.Scanner;
import java.lang.Math;

public class ucgen
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);

        int b,c;
        double cvr,hpt;

        System.out.printf("Ucgenin dik kenarlarindan birini giriniz:");
        b = tara.nextInt();

        System.out.printf("\nUcgenin diger dik kenarini giriniz:");
        c = tara.nextInt();

        hpt = Math.sqrt(b*b+c*c);
        cvr = (hpt+b+c);


        double alan = Math.sqrt((cvr/2)*((cvr/2)-hpt)*((cvr/2)-b)*((cvr/2)-c));

        System.out.printf("\nUcgenin cevresi = %.2f\nUcgenin alani = %.2f", cvr, alan);
    }
}
