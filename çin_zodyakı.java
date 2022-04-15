import java.util.*;

public class çin_zodyakı
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int yil, kalan;
        System.out.println("Bu program dogum yiliniza gore Cin Zodyagi burcunuzu hesaplar.");
        System.out.print("Dogum yilinizi giriniz:");
        yil = tara.nextInt();
        kalan = yil%12;

        switch (kalan)
        {
            case 0:
                System.out.print("Cin zodyagi burcunuz: Maymun");
                break;
            case 1:
                System.out.print("Cin zodyagi burcunuz: Horoz");
                break;
            case 2:
                System.out.print("Cin zodyagi burcunuz: Kopke");
                break;
            case 3:
                System.out.print("Cin zodyagi burcunuz: Domuz");
                break;
            case 4:
                System.out.print("Cin zodyagi burcunuz: Fare");
                break;
            case 5:
                System.out.print("Cin zodyagi burcunuz: Okuz");
                break;
            case 6:
                System.out.print("Cin zodyagi burcunuz: Kaplan");
                break;
            case 7:
                System.out.print("Cin zodyagi burcunuz: Tavsan");
                break;
            case 8:
                System.out.print("Cin zodyagi burcunuz: Ejderha");
                break;
            case 9:
                System.out.print("Cin zodyagi burcunuz: Yilan");
                break;
            case 10:
                System.out.print("Cin zodyagi burcunuz: At");
                break;
            default:
                System.out.print("Cin zodyagi burcunuz: Koyun");
        }
    }
}
