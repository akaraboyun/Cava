import java.util.*;
public class muqSayi
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int i=1, girdi, sum=0;
        System.out.print("""
                Bu kod gireceginiz bir pozitif tam sayinin mukemmel sayi olup olmadigini bulur.
                (Mukemmel sayi: kendisi haric pozitif tam sayi carpanlari toplami kendisine esit olan sayi.
                Bir sayi giriniz:""");
        girdi= tara.nextInt();

        while(i<girdi)
        {
            if(girdi%i==0)
                sum+=i;
            i++;
        }

        System.out.print((sum==girdi) ? "Girdiginiz sayi mukemmel sayidir.":"Girdiginiz sayi mukemmel sayi degildir.");

    }
}
