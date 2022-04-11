import java.util.Scanner;

public class taksimetre
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);

        double ucret, kmucreti = 2.20;
        int km, acilis = 10;

        System.out.printf("Gidilecek mesafeyi yaziniz:");
        km = tara.nextInt();

        ucret = (acilis+kmucreti*km)<=20? 20:(acilis+kmucreti*km);

        System.out.printf("Odenecek ucret:%.1f",ucret);
    }
}
